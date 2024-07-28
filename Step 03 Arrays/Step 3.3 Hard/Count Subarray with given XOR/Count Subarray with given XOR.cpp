int Solution::solve(vector<int> &A, int B) {
    int count = 0;
    int cumulativeXor = 0; 
    unordered_map<int, int> frontXor;
    frontXor[cumulativeXor]++;
    for (auto &x: A) {
        cumulativeXor = cumulativeXor ^ x;  
        int lookingFor = cumulativeXor ^ B;  
        
        count += frontXor[lookingFor];  
        
        frontXor[cumulativeXor]++;
    }
    
    return count;
}
