// https://www.geeksforgeeks.org/problems/minimum-element-in-bst/1

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
    int minValue(Node* root) {
        // code here
        while (root->left) root = root->left;
        return root->data;
        
    }
    int maxValue(Node *root) {
        while (root->right) root = root->right;
        return root->data;
    }
};