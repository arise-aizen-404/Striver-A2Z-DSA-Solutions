

//User function Template for Java

class Solution
{ 
    private static void insertAtBottom(Stack<Integer> s, int x) {
		if (s.isEmpty())
			s.push(x);
		else {
			int temp = s.pop();
			insertAtBottom(s, x);
			s.push(temp);
		}
	}
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        if (!s.isEmpty()) {
            int temp = s.pop();
            reverse(s);
            insertAtBottom(s, temp);
        }
    }
}