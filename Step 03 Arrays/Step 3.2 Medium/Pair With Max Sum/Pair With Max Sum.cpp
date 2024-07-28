class Solution {
  public:
    long long pairWithMaxSum(long long arr[], long long N) {
        // Your code goes here
        long long sum = LONG_MIN;
        long long maxi = LONG_MIN;
        for (int i=1; i<N; ++i) {
            sum = arr[i] + arr[i-1];
            maxi = max(maxi, sum);
        }
        return maxi;
    }
};