import java.util.Arrays;
class Solution {
    public static boolean findResult(int[] nums, int mid, int threshold) {
        int summ = 0;
        for (int x : nums) {
            summ += Math.ceil(x / (double) mid);
        }
        return summ <= threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt() + 1; // Add 1 to include the maximum value
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid == 0) {
                return 1; // Handle the case where mid is 0
            }
            if (findResult(nums, mid, threshold)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}


// class Solution {
//     public int smallestDivisor(int[] nums, int threshold) {
//         int low=1, high=Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             high = Math.max(high, nums[i]);
//         }
        
//         int ans=0;
//         while(low <= high){
//             int mid = low+(high-low)/2;
//             if(help(nums, mid) <= threshold){
//                 ans=mid;
//                 high=mid-1;
//             }else{
//                 low=mid+1;
//             }
//         }
//         return ans;
//     }
    
//     public static int help(int[] nums,int mid){
//         int sum=0;
//         for(int i=0;i<nums.length;i++){
//             sum+=(Math.ceil((double) nums[i]/mid));
//         }
//         return sum;
//     }
// }