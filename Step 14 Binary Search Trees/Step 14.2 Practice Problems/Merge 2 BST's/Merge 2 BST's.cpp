// https://www.geeksforgeeks.org/problems/merge-two-bst-s/1

/*
class Node {
  public:
    int data;
    Node *left;
    Node *right;

    Node(int val) {
        data = val;
        left = right = NULL;
    }
};
*/

class BSTIterator {
  private:
    Node *node;
  public:
    BSTIterator (Node *root) : node(root) {}
    int next() {
        int val = -1;
        while (node) {
            if (!node->left) {
                val = node->data;
                node = node->right;
                break;
            } else {
                Node *prev = node->left;
                while (prev->right && prev->right != node)
                    prev = prev->right;
                if (!prev->right) {
                    prev->right = node;
                    node = node->left;
                } else {
                    prev->right = nullptr;
                    val = node->data;
                    node = node->right;
                    break;
                }
            }
        }
        return val;
    }  
};

class Solution {
  public:
    vector<int> merge(Node *root1, Node *root2) {
        // code here
        vector<int> res;
        
        BSTIterator bst1(root1);
        BSTIterator bst2(root2);
        
        int val1 = bst1.next();
        int val2 = bst2.next();
        while (val1 != -1 && val2 != -1) {
            if (val1 <= val2) {
                res.push_back(val1);
                val1 = bst1.next();
            } else {
                res.push_back(val2);
                val2 = bst2.next();
            }
        }
        while (val1 != -1) {
            res.push_back(val1);
            val1 = bst1.next();
        }
        while (val2 != -1) {
            res.push_back(val2);
            val2 = bst2.next();
        }
        return res;
    }
};
// TC: O(2N)
// SC: O(1)