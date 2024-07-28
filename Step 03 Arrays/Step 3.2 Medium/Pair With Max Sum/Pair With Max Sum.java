
//User function Template for Java

class Solution {
    
    public static long pairWithMaxSum(long arr[], long N)
    {
        // Your code goes here
        long sum = Long.MIN_VALUE;
        long max = Long.MIN_VALUE;
        for (int i = 0; i < N-1; i++) {
            sum = arr[i] + arr[i+1];
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }
}