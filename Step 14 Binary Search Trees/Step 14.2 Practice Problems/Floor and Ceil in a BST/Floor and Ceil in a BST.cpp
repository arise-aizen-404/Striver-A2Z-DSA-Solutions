// https://www.geeksforgeeks.org/problems/closest-neighbor-in-bst/1

/*
Definition for Node
class Node {
  public:
    int data;
    Node *left;
    Node *right;

    Node(int val) {
        data = val;
        left = right = nullptr;
    }
}; */

class Solution {
  public:
    int findMaxFork(Node* root, int k) {
        // code here
        int floorVal = -1;
        while (root) {
            if (root->data > k) root = root->left;
            else {
                floorVal = root->data;
                root = root->right;
            }
        }
        return floorVal;
    }
    
//   private:
//     bool helper(Node *root, int k, int &floorVal) {
//         if (!root) return false;
//         if (root->data == k) {
//             floorVal = root->data;
//             return true;
//         }
//         if (root->data < k) {
//             floorVal = root->data;
//             helper(root->right, k, floorVal);
//         }
//         if (root->data > k) {
//             helper(root->left, k, floorVal);
//         }
//         return false;
//     }
//   public:
//     int findMaxFork(Node* root, int k) {
//         // code here
//         int floorVal = -1;
//         helper(root, k, floorVal);
//         return floorVal;
//     }
};

// https://www.geeksforgeeks.org/problems/implementing-ceil-in-bst/1

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
    int findCeil(Node* root, int x) {
        // code here
        int ceilVal = -1;
        while (root) {
            if (root->data < x) root = root->right;
            else {
                ceilVal = root->data;
                root = root->left;
            }
        }
        return ceilVal;
    }
};