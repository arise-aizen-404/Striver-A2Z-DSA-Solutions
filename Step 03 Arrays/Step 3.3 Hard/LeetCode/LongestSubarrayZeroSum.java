import java.util.HashMap;

public class Solution {
    public static int getLongestZeroSumSubarrayLength(int[] arr) {
        // Write your code here.
        HashMap<Integer, Integer> hMap = new HashMap<>();
        int summ = 0;
        int maxLen = 0;
        for (int it = 0; it < arr.length; ++it) {
            summ += arr[it];
            if (summ == 0) {
                maxLen = it + 1;
            }
            if (hMap.containsKey(summ)) {
                maxLen = Math.max(maxLen, (it - hMap.get(summ)));
            } else {
                hMap.put(summ, it);
            }
        }
        return maxLen;
    }
}
