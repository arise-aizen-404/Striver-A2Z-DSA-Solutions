

//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> total = new ArrayList<>();
        for (int i = 0; i < (1 << N); i++) {
            int subsetSum = 0;
            for (int j = 0; j < N; j++) {
                if ((i & (1 << j)) > 0) {
                    subsetSum += arr.get(j);
                }
            }
            total.add(subsetSum);
        }
        return total;
    }
}