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