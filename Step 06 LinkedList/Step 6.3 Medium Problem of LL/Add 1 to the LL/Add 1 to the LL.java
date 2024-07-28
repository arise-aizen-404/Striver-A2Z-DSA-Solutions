import java.util.* ;
import java.io.*; 
/*************************************************************

Following is the class structure of the Node class:

    class Node {
		public int data;
		public Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
	  	}
    }

*************************************************************/

public class Solution {
	static int addHelper(Node temp) {
		if(temp == null)
			return 1;
		int carry = addHelper(temp.next);
		temp.data += carry;
		if(temp.data < 10)
			return 0;
		temp.data = 0;
		return 1;	
	}
	public static Node addOne(Node head) {
		int carry = addHelper(head);
		if(carry == 1) {
			Node newNode = new Node(1);
			newNode.next = head;
			head = newNode;
		}
		return head;
	}
	// static Node reverseHead(Node head) {
	// 	Node prev = null;
	// 	Node curr = head;
	// 	Node follow = null;
	// 	while(curr != null) {
	// 		follow = curr.next;
	// 		curr.next = prev;
	// 		prev = curr;
	// 		curr = follow;
	// 	}
	// 	return prev;
	// }
	// public static Node addOne(Node head) {
	// 	// Write your code here.
	// 	Node rHead = reverseHead(head);
	// 	Node temp = rHead;
	// 	int carry = 1;
	// 	while(temp != null) {
	// 		if(temp.data < 9) {
	// 			temp.data += carry;
	// 			carry = 0;
	// 			break;
	// 		} else {
	// 			temp.data = 0;
	// 		}
	// 		temp = temp.next;
	// 	}
	// 	head = reverseHead(rHead);
	// 	if(carry == 1) {
	// 		Node newNode = new Node(1);
	// 		newNode.next = head;
	// 		return newNode;
	// 	}
	// 	return head;
	// }
}