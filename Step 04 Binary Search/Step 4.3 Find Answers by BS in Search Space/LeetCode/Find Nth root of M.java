public class Solution {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int low = 1;
        int high = m;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int poww = (int)Math.pow(mid, n);
            if(poww == m) return mid;
            else if(poww < m) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
