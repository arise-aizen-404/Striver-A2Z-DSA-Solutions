// https://www.geeksforgeeks.org/problems/inorder-successor-in-bst/1

/*
Definition for Node
class Node {
  public:
    int data;
    Node* left;
    Node* right;

    Node(int val) {
        data = val;
        left = right = nullptr;
    }
};
*/

class Solution {
  public:
    int inOrderSuccessor(Node *root, Node *k) {
        // code here
        int val = k->data;
        int ans = -1;
        while (root) {
            if (root->data <= val) root = root->right;
            else {
                ans = root->data;
                root = root->left;
            }
        }
        return ans;
    }
};