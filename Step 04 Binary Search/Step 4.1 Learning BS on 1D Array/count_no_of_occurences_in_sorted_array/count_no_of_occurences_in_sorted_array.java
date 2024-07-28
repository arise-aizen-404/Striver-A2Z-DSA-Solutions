

//User function Template for Java



class Solution {
    int count(int[] arr, int n, int k) {
        // code here
        int startPos = -1;
        int low = 0;
        int high = n - 1;

        // Finding the start position
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        startPos = low;

        if (startPos >= n || arr[startPos] != k) {
            return 0;
        }

        // Finding the end position
        int endPos = -1;
        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        endPos = high;

        return endPos - startPos + 1;
    }
}