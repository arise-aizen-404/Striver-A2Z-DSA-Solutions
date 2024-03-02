class Solution {
    private int getMaxEle(int[] arr) {
        int maxEle = Integer.MIN_VALUE;
        for(int x : arr) {
            maxEle = Math.max(maxEle, x);
        }
        return maxEle;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = getMaxEle(piles);
        while(low <= high) {
            int mid = low + (high - low) / 2;
            double totalHours = 0;
            for(int x : piles) {
                totalHours += Math.ceil((double)x / (double)mid);
            }
            if(totalHours <= h) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}

// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {
//         int start=1;// because koko will definitely eat one banana.
//         int end=Integer.MAX_VALUE;
//         while(start<=end){
//             int sph=start+(end-start)/2;
//             if(hoursTaken(piles,h,sph))
//                   start=sph+1;
//             else
//                   end=sph-1;    
//         }
//         return start;
//     }
    
//     static boolean hoursTaken(int[] piles,int h,int sph){
//         int hours=0;
//         for(int pile:piles){
//             int d=pile/sph ;
//             hours+=d;
//             int r=pile%sph; 
//             if(r!=0) hours++;
//         }
//         return hours>h;
//     }
// }