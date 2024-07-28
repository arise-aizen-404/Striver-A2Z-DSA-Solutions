/*Complete the function below*/
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        //Code here
        int  cnt = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
}
    