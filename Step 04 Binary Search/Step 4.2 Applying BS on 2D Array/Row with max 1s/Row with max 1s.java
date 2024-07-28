

// User function Template for Java

class Solution {
    public int rowWithMax1s(int matrix[][]) {
        // code here
        int row =  matrix.length;
        int col = matrix[0].length;
        int  maxCount = 0;
        int resInd = -1;
        for(int i=0; i<row; ++i) {
            int low = 0;
            int high = col - 1;
            while(low <= high) {
                int mid = low + (high - low) / 2;
                if(matrix[i][mid] == 1) high = mid - 1;
                else low = mid + 1;
            }
            // if (high < 0) high = 0;
            int count = col - (high + 1);
            if(maxCount < count) {
                maxCount = Math.max(maxCount, count);
                resInd = i;
            }
        }
        return resInd;
    }
}