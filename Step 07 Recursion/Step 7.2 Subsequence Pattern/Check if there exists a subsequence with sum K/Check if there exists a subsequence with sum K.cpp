bool isSubsetPresent(int n, int k, vector<int> &a) {
    vector<vector<bool>> dp(n + 1, vector<bool>(k + 1, false));
    
    for (int i = 0; i <= n; ++i) {
        dp[i][0] = true;
    }

    for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <= k; ++j) {
            if (a[i - 1] <= j) {
                dp[i][j] = dp[i - 1][j] || dp[i - 1][j - a[i - 1]];
            } else {
                dp[i][j] = dp[i - 1][j];
            }
        }
    }

    return dp[n][k];
}