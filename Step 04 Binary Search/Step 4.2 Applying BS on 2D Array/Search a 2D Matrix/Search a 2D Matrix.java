class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) {
            return false;
        }
        int n = matrix[0].length;
        int left = 0;
        int right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midElement = matrix[mid / n][mid % n];

            if (midElement == target) {
                return true;
            } else if (midElement < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}


// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int m = matrix.length;
//         int n = matrix[0].length;
//         int index = -1;
//         for(int i=0;i<m;i++){
//             if(matrix[i][n-1]>=target){
//                 index = i;
//                 break;
//             }
//         }
//         if(index == -1) return false;
//         int low = 0;
//         int high = n-1;
//         while(low<=high){
//             int mid=(low+high)/2;
//             if(matrix[index][mid] == target) return true;
//             else if(matrix[index][mid] > target) high=mid-1;
//             else if(matrix[index][mid] < target) low=mid+1;
//         }
//         return false;
//     }
// }