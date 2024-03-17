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
 }

 *****************************************************************/

public class Solution {
    public static Node deleteAllOccurrences(Node head, int k) {
        // Handle the case where the linked list is empty
        if (head == null) {
            return null;
        }

        // Create a dummy node to simplify edge cases
        Node dummy = new Node(0, head, null);
        Node prev = dummy;
        Node curr = head;

        while (curr != null) {
            if (curr.data == k) {
                // Remove the current node
                prev.next = curr.next;
                if (curr.next != null) {
                    curr.next.prev = prev;
                }
                curr = prev.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        // Return the new head of the modified linked list
        return dummy.next;
    }
}