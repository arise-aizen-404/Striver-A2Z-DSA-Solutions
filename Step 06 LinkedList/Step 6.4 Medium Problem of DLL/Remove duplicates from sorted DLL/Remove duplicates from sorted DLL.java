/********************************************************

    Following is the class structure of the Node class:
    
    class Node
    {
        public:
            int data;
            Node next;
            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
    };

********************************************************/

public class Solution {
    public static Node uniqueSortedList(Node head) {
        // Write your code here.
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!=null) {
            if(prevNode.data != currNode.data) {
                // currNode.prev = prevNode;
                prevNode.next = currNode;
                currNode = currNode.next;
                prevNode = prevNode.next;
            } else 
                currNode = currNode.next;
        }
        prevNode.next = currNode;
        return head;
    }
}