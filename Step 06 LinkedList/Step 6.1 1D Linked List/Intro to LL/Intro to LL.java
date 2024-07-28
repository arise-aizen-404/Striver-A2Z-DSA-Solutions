

// User function Template for Java

/*
class Node { 
    int data; 
    Node next; 

    Node() { data = 0; }
    Node(int d) { data = d; }  //constructor to create a new node
} 
*/
class Solution {
    static Node constructLL(int arr[]) {
        // code here
        int len = arr.length;
        Node head=null, temp=null;
        int i = 0;
        while( i<len ){
            Node ptr = new Node(arr[i]);
            if(head==null) head = ptr;
            else temp.next = ptr;
            temp = ptr;
            i++;
        }
        return head;
    }
}