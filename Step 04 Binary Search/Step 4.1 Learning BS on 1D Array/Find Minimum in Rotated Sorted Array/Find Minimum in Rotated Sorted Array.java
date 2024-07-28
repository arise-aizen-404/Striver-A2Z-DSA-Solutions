class Solution {
    public int findMin(int[] arr) {
        // int  low = 0;
        // int high = nums.length - 1;
        // while(low<high) {
        //     int mid = low + (high - low) / 2;
        //     if(nums[mid] > nums[high]) low = mid + 1;
        //     else high = mid;
        // }
        // return nums[low];
        
        int ans = Integer.MAX_VALUE;
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[low] <= arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            } else {
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }
}