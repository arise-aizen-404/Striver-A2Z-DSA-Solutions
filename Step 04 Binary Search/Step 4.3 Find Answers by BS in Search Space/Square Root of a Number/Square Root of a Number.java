

/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long N)
	 {
		// Your code here
		int ans = 0;
		int low = 1;
        int high = (int) N; // Cast N to int for high since the result is expected to be an int
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long res = (long) mid * mid; // Cast mid to long before squaring to avoid overflow
            if(res <= N) {
				ans = mid;
				low = mid + 1;
			}
            else high = mid - 1;
        }
        return ans;
	 }
}