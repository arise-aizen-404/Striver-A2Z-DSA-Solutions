import java.util.*;
import java.io.*;

public class Solution {
    static int getFloor(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        // int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) return arr[mid];
            else if(arr[mid] < x) low = mid + 1;
            else high = mid - 1;
        }
        return high == -1 ? -1 : arr[high];
    }

    static int getCeil(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        // int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) return arr[mid];
            else if(arr[mid] < x) low = mid + 1;
            else high = mid - 1;
        }
        return low == n ? -1 : arr[low];
    }

    public static int[] getFloorAndCeil(int[] arr, int n, int x) {
        int[] res = new int[2];
        res[0] = getCeil(arr, n, x);
        res[1] = getFloor(arr, n, x);
        return res;
    }
}
