

class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        int max_len = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, -1);
        for (int i=0; i<n; ++i) {
            sum += arr[i];
            if (map.containsKey(sum) || sum==0) {
                max_len = Math.max(max_len, (i - map.get(sum)));
            } else {
                map.put(sum, i);
            }
        }
        return max_len;
    }
}