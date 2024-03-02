class Solution {
    private int getMinEle(int[] arr) {
        int minEle = Integer.MAX_VALUE;
        for(int x : arr) {
            minEle = Math.min(minEle, x);
        }
        return minEle;
    }
    private int getMaxEle(int[] arr) {
        int maxEle = Integer.MIN_VALUE;
        for(int x : arr) {
            maxEle = Math.max(maxEle, x);
        }
        return maxEle;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < m*k) return -1;
        int low = getMinEle(bloomDay);
        int high = getMaxEle(bloomDay);
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int count  = 0;
            int tracker = 0;
            for(int x : bloomDay) {
                if(x <= mid) tracker++;
                else {
                    count += tracker/k;
                    tracker = 0;
                }
            }
            count += tracker / k;
            if(count >= m) {
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        // return (low != (getMaxEle(bloomDay)+1)) ? low : -1;
        return ans;
    }
}

// class Solution {
//     public static boolean check(int[] bloomDay, int mid, int m, int k){
//         for(int i=0;i<bloomDay.length;i++){
//             int count = k;
//             while(i<bloomDay.length && bloomDay[i]<=mid){
//                 count--;
//                 if(count==0){
//                     m--;
//                     break;
//                 }
//                 i++;
//             }
//             if(m==0) return true;
//         }
//         return false;
//     }
    
//     public int minDays(int[] bloomDay, int m, int k) {
//         if(m*k > bloomDay.length) return -1;
//         int l=Integer.MAX_VALUE, h=Integer.MIN_VALUE;
//         for(int i=0;i<bloomDay.length;i++){
//             l=Math.min(l, bloomDay[i]);
//             h=Math.max(h, bloomDay[i]);
//         }
//         while(l<=h){
//             int mid=l+(h-l)/2;
//             if(check(bloomDay, mid, m, k)==true) h=mid-1;
//             else l=mid+1;
//         }
//         return l;
//     }
// }