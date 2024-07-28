

//User function Template for Java

class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        int len = arr.length;
        Node head = null, temp = null;
        int i = 0;
        while( i<len ){
            Node ptr = new Node(arr[i]);
            if(head == null) head = ptr;
            else{
                temp.next = ptr;
                ptr.prev = temp;
            }
            temp = ptr;
            i++;
        }
        return head;
    }
}