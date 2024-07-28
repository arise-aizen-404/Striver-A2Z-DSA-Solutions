class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(weights, days, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean isPossible(int[] weights, int days, int capacity) {
        int currDays = 1;
        int loadCapacity = 0;

        for (int weight : weights) {
            if (weight + loadCapacity > capacity) {
                currDays += 1;
                loadCapacity = weight;
            } else {
                loadCapacity += weight;
            }
        }
        return currDays <= days;
    }
}

// class Solution {
//     public int shipWithinDays(int[] weights, int days) {
//         int left = 0, right = 0;
//         for (int w: weights) {
//             left = Math.max(left, w);
//             right += w;
//         }
//         while (left < right) {
//             int mid = (left + right) / 2, need = 1, cur = 0;
//             for (int w: weights) {
//                 if (cur + w > mid) {
//                     need += 1;
//                     cur = 0;
//                 }
//                 cur += w;
//             }
//             if (need > days) left = mid + 1;
//             else right = mid;
//         }
//         return left;
//     }
// }