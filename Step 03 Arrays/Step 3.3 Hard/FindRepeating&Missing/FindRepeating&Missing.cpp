class Solution{
public:
    vector<int> findTwoElement(vector<int> arr, int n) {
        // code here
        vector<int> hash(n);
        vector<int> ans(2);
        for(int i: arr){
            hash[i-1]++;
        }
        for(int i = 0; i < n; i++){
            if(hash[i] == 2){
                ans[0] = i+1 ;
            }
            if(hash[i] == 0){
                ans[1] = i+1;
            }
        }
        return ans;
    }
};