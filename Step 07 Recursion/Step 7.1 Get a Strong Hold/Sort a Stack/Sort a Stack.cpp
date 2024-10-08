

/*The structure of the class is
class SortedStack{
public:
	stack<int> s;
	void sort();
};
*/

/* The below method sorts the stack s 
you are required to complete the below method */
stack<int> insertEle(stack<int> s, int x) {
    if (s.empty() || x > s.top()) {
        s.push(x);
    } else {
        int temp = s.top();
        s.pop();
        s = insertEle(s, x);
        s.push(temp);
    }
    return s;
}
void SortedStack::sort() {
    if (!s.empty()) {
        int x = s.top();
        s.pop();
        sort();
        s = insertEle(s, x);
    }
}