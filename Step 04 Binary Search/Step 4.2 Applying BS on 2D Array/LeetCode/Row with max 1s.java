public class Solution
{
    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        //	  Write your code here.
        int row =  matrix.size();
        int col = matrix.get(0).size();
        int  maxCount = 0;
        int resInd = 0;
        for(int i=0; i<row; ++i) {
            int low = 0;
            int high = col - 1;
            while(low <= high) {
                int mid = low + (high - low) / 2;
                if(matrix.get(i).get(mid) == 1) high = mid - 1;
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