import java.util.*;

class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[] v = new int[2];

        for (int i = 0; i < row; i++) {
            int low = 0;
            int high = col - 1;
            while (low <= high) {
                int mid = (low + high) >> 1;
                int u = i > 0 ? mat[i - 1][mid] : -1;
                int l = mid > 0 ? mat[i][mid - 1] : -1;
                int d = i < row - 1 ? mat[i + 1][mid] : -1;
                int r = mid < col - 1 ? mat[i][mid + 1] : -1;
                int m1 = Math.max(u, d);
                int m2 = Math.max(l, r);
                int l1 = Math.max(l, mat[i][0]);
                int l2 = Math.max(r, mat[i][col - 1]);

                if (mat[i][mid] >= Math.max(m1, m2)) {
                    v[0] = i;
                    v[1] = mid;
                    return v;
                } else if (l1 > l2)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }
        return v;
    }
}


// class Solution {
//     public int[] findPeakGrid(int[][] mat) {
//         int start=0;
//         int end=mat[0].length-1;
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             int row=0;
//             for(int i=1; i<mat.length; i++){
//                 if(mat[row][mid]<mat[i][mid])
//                 row=i;  
//             }
//             if( (mid==0||mat[row][mid]>mat[row][mid-1]) && (mid==end||mat[row][mid]>mat[row][mid+1]))
//                 return new int[]{row,mid};
//             else if(mat[row][mid]<mat[row][mid+1])
//                 start=mid+1;
//             else
//                 end=mid-1;
//         }
//         return new int[]{-1,-1};
//     }
// }