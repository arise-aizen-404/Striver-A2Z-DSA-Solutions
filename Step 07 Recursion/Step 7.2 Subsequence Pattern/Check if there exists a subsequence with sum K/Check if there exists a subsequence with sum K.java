public class Solution {
    public static boolean isSubsetPresent(int n, int k, int[] a) {
        boolean[][] dp = new boolean[n + 1][k + 1];
        
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (a[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - a[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][k];
    }
}


/*
 * public class Solution {
    private static boolean myHelper(int arr[], int n, int sum, int currSum, int index) {
        if (index == n) {
            if (currSum == sum) {
                return true;
            }
            return false;
        }

        // Case 1: Exclude the current character and move to the next
        boolean exclude = myHelper(arr, n, sum, currSum, index + 1);

        // Case 2: Include the current character and move to the next
        boolean include = myHelper(arr, n, sum, currSum + arr[index], index + 1);

        return (exclude == true || include == true);
    }
    public static boolean isSubsetPresent(int n, int k,int []a) {
        // Write your code here
        return myHelper(a, n, k, 0, 0);
    }
}
 */