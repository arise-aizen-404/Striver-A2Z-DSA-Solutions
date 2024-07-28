class Solution {
    public int maxProduct(int[] nums) {
        double prefix = 1;
        double suffix = 1;
        int maxx = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; ++i) {
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;
            prefix *= nums[i];
            suffix *= nums[nums.length - i - 1];
            maxx = Math.max(maxx, Math.max(prefix, suffix));
        }
        return maxx;
    }
}