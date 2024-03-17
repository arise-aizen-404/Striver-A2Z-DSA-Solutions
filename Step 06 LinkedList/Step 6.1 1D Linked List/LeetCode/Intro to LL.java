/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class Solution {
    public static Node constructLL(int []arr) {
        // Write your code here
        Node head = null;
        Node temp = null;
        for(int x: arr) {
            if(head == null) {
                head = new Node(x);
                temp = head;
            }
            else {
                temp.next = new Node(x);
                temp = temp.next;
            }
        }
        return head;
    }
}