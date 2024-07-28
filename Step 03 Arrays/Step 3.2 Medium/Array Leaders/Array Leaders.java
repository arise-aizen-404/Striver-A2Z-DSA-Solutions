class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        int s=0;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=s)
            ans.add(0,arr[i]);
            s=Math.max(s,arr[i]);
        }
        return ans;
    }
}