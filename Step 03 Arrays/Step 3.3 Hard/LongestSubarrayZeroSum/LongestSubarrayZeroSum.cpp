/*You are required to complete this function*/

class Solution {
  public:
    int maxLen(vector<int>& arr, int n) {
        // Your code here
        int max_len = 0;
        unordered_map<int, int> map;
        int sum = 0;
        map[0] = -1;
        for (int i=0; i<n; ++i) {
            sum += arr[i];
            if (map.find(sum)!=map.end() || sum==0) {
                max_len = max(max_len, (i - map[sum]));
            } else {
                map[sum] = i;
            }
        }
        return max_len;
    }
};