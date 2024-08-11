class Solution {
    public int maxDepth(String s) {
        int len = s.length();
		int level = 0;
		int max = 0;
		for(int i = 0; i < len; ++i){
			final char ch = s.charAt(i);
			if(ch == '(') ++level;
			if(ch == ')') --level;
			if(level > max) max = level;
		}
		return max;
    }
}

// import java.util.Stack;

// class Solution {
//     public int maxDepth(String s) {
//         Stack<Character> st = new Stack<>();
//         int maxNested = 0;
//         for (char x : s.toCharArray()) {
//             if (x == '(') {
//                 st.push(x);
//             } else if (x == ')') {
//                 if (!st.isEmpty()) {
//                     st.pop();
//                 }
//             }
//             maxNested = Math.max(maxNested, st.size());
//         }
//         return maxNested;
//     }
// }
