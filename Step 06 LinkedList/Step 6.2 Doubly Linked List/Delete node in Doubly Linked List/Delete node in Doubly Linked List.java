

//User function Template for Java

/* Structure of linkedlist node
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}
*/
class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	    // Your code here
	    if(x==1){
	        head.next.prev = null;
	        head = head.next;
	        return head;
	    }
	    Node temp = head;
	    int i = 1;
	    while( i<x-1 ){
	        temp = temp.next;
	        i++;
	    }
	    if(temp.next.next != null ) temp.next.next.prev = temp;
	    temp.next = temp.next.next;
	    return head;
    }
}