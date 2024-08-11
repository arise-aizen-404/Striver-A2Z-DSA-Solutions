

/*Complete the function below*/
class GfG{
    private Stack<Integer> insertEle(Stack<Integer> s, int x) {
        if (s.isEmpty() || x > s.peek()) {
            s.push(x);
            return s;
        }
        int temp = s.pop();
        insertEle(s, x);
        s.push(temp);
        return s;
    }
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		if (!s.isEmpty()) {
		    int x = s.pop();
		    sort(s);
		    insertEle(s, x);
		}
		return s;
	}
}