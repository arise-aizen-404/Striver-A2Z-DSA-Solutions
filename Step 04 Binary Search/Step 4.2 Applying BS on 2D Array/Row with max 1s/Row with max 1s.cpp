// User function template for C++
class Solution {
  public:
     //optimal approach tc->o(arr.size() * log(2,(arr[i].size())) sc->o(1)

int first_occurence_index(vector<int>&arr,int n,int x){
        int low=0;int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

 int rowWithMax1s(vector<vector<int>> arr) {

int cnt_max=0;int row=-1;
for(int i=0;i<arr.size();i++){
    int cnt_ones=arr[i].size()-first_occurence_index(arr[i],arr[i].size(),1);
    if(cnt_ones>cnt_max){
        cnt_max=cnt_ones;
        row=i;
    }
    }
   return row; 
 }
};