// DP APPROACH

class Solution {
  public:
    string betterString(string str1, string str2) 
    {
        int a = countSubSeq(str1);
        int b = countSubSeq(str2);
        if(a == b)
            return str1;
        if(a>b)
        {
            return str1;
        }
        else
            return str2;
        // code here
    }
    int countSubSeq(string &str)
    {
        unordered_map<char,int> mp;
        int n = str.size();
        int dp[n+1];
        dp[0] = 1;
        for(int i = 1; i <=n; i++)
        {
            dp[i] = 2 * dp[i-1];
            if(mp.find(str[i-1]) != mp.end())
            {
                dp[i] = dp[i] - dp[mp[str[i-1]]];
            }
            mp[str[i-1]] = i-1;
        }
        return dp[n];
    }
};

// RECURSIVE APPROACH

// class Solution {
//   public:
    // int countDistinctSubsequences(const string& s, int index, string current, unordered_set<string>& subsequences) {
    //     if (index == s.size()) {
    //         if (subsequences.find(current) == subsequences.end()) {
    //             subsequences.insert(current);
    //             return 1;
    //         }
    //         return 0;
    //     }

    //     // Case 1: Exclude the current character and move to the next
    //     int exclude = countDistinctSubsequences(s, index + 1, current, subsequences);

    //     // Case 2: Include the current character and move to the next
    //     current.push_back(s[index]);
    //     int include = countDistinctSubsequences(s, index + 1, current, subsequences);

    //     return exclude + include;
    // }

    // int countDistinctSubsequences(const string& s) {
    //     unordered_set<string> subsequences;
    //     return countDistinctSubsequences(s, 0, "", subsequences) - 1; // Subtract 1 to exclude the empty subsequence
    // }

//     string betterString(const string& str1, const string& str2) {
//         int count1 = countDistinctSubsequences(str1);
//         int count2 = countDistinctSubsequences(str2);

//         if (count1 >= count2) {
//             return str1;
//         } else {
//             return str2;
//         }
//     }
// };