class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
    //     vector<vector<int>> result;

    // sort(arr.begin(),arr.end());
    // int n = arr.size();
    // for(int i=0; i<n-2; i++){

    //     int left = i + 1;

    //     int right= n - 1;

    //     while(left < right){

    //         int sum = arr[i]+arr[left]+arr[right];

    //         if(sum==0){

    //             result.push_back({arr[i],arr[left],arr[right]});

    //             left++;

    //             right--;

    //             while(left < right && arr[left] == arr[left-1]) {

    //                 left++;

    //             }

    //             while(left < right && arr[right] == arr[right+1]) {

    //                 right--;

    //             }

    //         }

    //         else if(sum < 0){

    //             left++;

    //         }

    //         else{

    //             right--;

    //         }

    //     }

    //     while( i + 1 < n && arr[i] == arr[i + 1]) {

    //         i++;

    //     }

    // }

    // return result;

        vector<vector<int>> ans;
        sort(nums.begin(),nums.end());
        int n = nums.size();
        for(int i=0;i<n-2;++i){
            int low = i+1;
            int high = n-1;
            while(low<high){
                int x = nums[i]+nums[low]+nums[high];
                if(x==0) {
                    // vector<int> v = {nums[i],nums[low],nums[high]};
                    // ans.insert(v);
                    ans.push_back({nums[i],nums[low],nums[high]});
                    low++; high--;
                    while(low<high && nums[low]==nums[low-1]) low++;
                    while(low<high && nums[high]==nums[high+1]) high--;
                }
                else if(x>0) high--;
                else low++;
            }
            while( i + 1 < n && nums[i] == nums[i + 1]) i++;
        }
        // return vector<vector<int>> (ans.begin(),ans.end());
        return ans;
    }
};