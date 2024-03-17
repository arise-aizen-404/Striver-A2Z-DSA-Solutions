/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next, Node prev)
     {
         this.data = data;
         this.next = next;
         this.prev = prev;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node insertAtTail(Node head, int k) {
        // Write your code here
        Node newNode = new Node(k);
        if(head == null)
            return newNode;
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
        return head;
    }
}