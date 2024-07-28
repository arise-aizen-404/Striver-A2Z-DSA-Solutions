class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int miss = 0;
        for (auto x: nums)  miss ^= x;
        return miss;
    }
};