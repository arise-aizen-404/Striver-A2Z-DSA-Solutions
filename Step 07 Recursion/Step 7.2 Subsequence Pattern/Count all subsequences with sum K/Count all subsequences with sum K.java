

class Solution{
	public int perfectSum(int arr[], int n, int sum) {
//         if (n == 1) return (arr[0] == target) ? 1 : 0;
//         // Arrays.sort(arr);
//         HashMap<Integer, Integer> preSum = new HashMap<>();
//         int count = 0;
//         int left = 0;
//         int right = 0;
//         int currSum = arr[0];
//         preSum.put(arr[0], 1); // Initialize with 1 way to get currSum
//         int MOD = 1000000007; // Modulo value
//         while ((left <= right) && right < n) {
//             if (preSum.containsKey(target - currSum)) {
//                 count = (count + preSum.get(target - currSum)) % MOD;
//             }
    
//             if (currSum < target) {
//                 right++;
//                 if (right < n) {
//                     currSum = (currSum + arr[right]) % MOD;
//                 }
//             } else if (currSum >= target) {
//                 currSum = (currSum - arr[left]) % MOD;
//                 left++;
//             }
//             // Update the count of ways to get currSum
//             preSum.put(currSum, (preSum.getOrDefault(currSum, 0) + 1) % MOD);
//         }
    
//         return count;
int MOD = (int)1e9+7;

        // Initialize a 1D array to store the count of subsets
        int[] dp = new int[sum + 1];

        // There is one way to make sum = 0, which is by not including any element
        dp[0] = 1;

        // Fill the dp array using a bottom-up approach
        for (int i = 0; i < n; i++) {
            for (int j = sum; j >= arr[i]; j--) {
                // If the current element can be included in the subset
                // (i.e., it is less than or equal to the current sum),
                // update dp[j] by adding dp[j - arr[i]]
                dp[j] = (dp[j] + dp[j - arr[i]]) % MOD;
            }
        }

        // The result is stored in dp[sum]
        return dp[sum];
}
}