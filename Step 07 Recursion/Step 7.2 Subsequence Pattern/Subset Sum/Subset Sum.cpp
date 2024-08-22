
class Solution {
private:
	void myHelper(vector<int> &res, vector<int> &arr, int n, int currSum, int index) {
        if (index == n) {
            res.push_back(currSum); return;
            
        }
        // Case 1: Exclude the current character and move to the next
        myHelper(res, arr, n, currSum, index + 1);

        // Case 2: Include the current character and move to the next
        myHelper(res, arr, n, currSum + arr[index], index + 1);
    }
  public:
    vector<int> subsetSums(vector<int> arr, int n) {
        // Write Your Code here
        vector<int> res;
        myHelper(res, arr, n, 0, 0);
        return res;
    }
};