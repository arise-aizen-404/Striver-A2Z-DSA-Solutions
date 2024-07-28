

/* Structure of Doubly Linked List
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}*/

class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
		// Your code here
		Node ptr = new Node(data);
		Node temp = head_ref;
		int i = 0;
		while( i<pos ){
		    temp = temp.next;
		    i++;
		}
		ptr.next = temp.next;
		if(temp.next!=null) temp.next.prev = ptr;
		ptr.prev = temp;
		temp.next = ptr;
	}
}