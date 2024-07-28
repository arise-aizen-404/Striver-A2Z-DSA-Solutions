import java.util.HashMap;
import java.util.Arrays;

public class Solution {
    public static int[] findMissingRepeatingNumbers(int []a) {
        // Write your code here
        HashMap<Integer, Boolean> hMap = new HashMap<>();
        int repeatedOne = 0;
        int messedSum = Arrays.stream(a).sum();
        for(int x : a) {
            if(hMap.containsKey(x)) {
                repeatedOne = x;
                break;
            } else {
                hMap.put(x, true);
            }
        }
        int n = a.length;
        int originalSum = (n*(n+1)) / 2;
        return new int[]{repeatedOne, Math.abs(originalSum - (messedSum - repeatedOne))};
    }
}

// class Solve {
//     int[] findTwoElement(int arr[], int n) {
//         // code here
//         int hash[] = new int[n];
//         int ans[] = new int[2];
//         for(int i: arr){
//             hash[i-1]++;
//         }
//         for(int i = 0; i < n; i++){
//             if(hash[i] == 2){
//                 ans[0] = i+1 ;
//             }
//             if(hash[i] == 0){
//                 ans[1] = i+1;
//             }
//         }
//         return ans;
//     }
// }