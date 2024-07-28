class Solution{
    public:
    int lenOfLongSubarr(int nums[],  int n, int k) 
    { 
        // Complete the function
        map<long, int> sumMap;
        long sum = 0;
        int maxLength = 0;
        for (int i = 0; i < n; ++i) {
            sum += nums[i];
            if (sum == k) {
                maxLength = i + 1;
            }
            if (sumMap.find(sum - k) != sumMap.end()) {
                maxLength = max(maxLength, i - sumMap[sum - k]);
            }
            if (sumMap.find(sum) == sumMap.end())
            sumMap[sum] = i;
            // We are making it absent cause if the arr contains 0's then we
            // should not update the value - watch strvier video for more info.
        }
        return maxLength;
    } 

};