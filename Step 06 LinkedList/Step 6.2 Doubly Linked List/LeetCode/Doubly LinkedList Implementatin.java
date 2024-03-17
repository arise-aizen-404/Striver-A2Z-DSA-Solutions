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
    public static Node constructDLL(int []arr) {
        // Write your code here
        Node head = null;
        Node temp = null;
        for(int x: arr) {
            if(head == null) {
                head = new Node(x);
                temp = head;
                continue;
            } else {
                Node newNode = new Node(x);
                temp.next = newNode;
                newNode.prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }
}