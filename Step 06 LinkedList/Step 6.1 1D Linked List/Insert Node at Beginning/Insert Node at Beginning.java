

/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        Node ptr = new Node(x);
        ptr.next = head;
        head = ptr;
        return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
        Node ptr = new Node(x);
        if(head == null){
            head = ptr;
            return head;
        }
        Node temp = head;
        while(temp.next!=null) temp = temp.next;
        temp.next = ptr;
        return head;
    }
}