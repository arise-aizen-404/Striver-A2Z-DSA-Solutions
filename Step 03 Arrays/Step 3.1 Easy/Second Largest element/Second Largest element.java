

//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int firstMax = -1;
        int secondMax = -1;
    
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if (x > firstMax) {
                secondMax = firstMax;
                firstMax = x;
            } else if (x < firstMax && x > secondMax) {
                secondMax = x;
            }
        }
        
        return secondMax;
    }
}