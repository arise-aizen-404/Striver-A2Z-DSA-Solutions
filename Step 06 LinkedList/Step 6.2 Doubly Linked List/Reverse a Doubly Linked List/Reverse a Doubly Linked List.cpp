/*
struct Node
{
    int data;
    Node * next;
    Node * prev;
    Node (int x)
    {
        data=x;
        next=NULL;
        prev=NULL;
    }
        
};
*/
class Solution
{
    public:
    Node* reverseDLL(Node * head)
    {
        //Your code here
        stack<int>s;
        Node * temp=head;
        while(temp){
            s.push(temp->data);
            temp=temp->next;
        }
        temp=head;
        while(temp){
            temp->data=s.top();
            s.pop();
            temp=temp->next;
        }
        return head;
    }
};
