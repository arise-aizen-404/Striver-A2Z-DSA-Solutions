class Solution
{
    public:
    
    long long int substrCount(const std::string& s, int k) {
            return solve(s, k) - solve(s, k - 1);
    }
    private:
    
    long solve(const std::string& s, int k) {
        int i = 0, j = 0, size = 0, n = s.length();
        long ans = 0;
        int map[26] = {0};

        while (j < n) {
            char cha = s[j];
            if (map[cha - 'a'] == 0) size++;
            map[cha - 'a']++;

            while (size > k) {
                char chr = s[i];
                map[chr - 'a']--;
                if (map[chr - 'a'] == 0) size--; 
                i++;
            }

            ans += j - i + 1; 
            j++;
        }
        return ans;
    }
};