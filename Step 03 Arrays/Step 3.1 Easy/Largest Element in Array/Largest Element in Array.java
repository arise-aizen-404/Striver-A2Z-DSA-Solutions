

//User function Template for Java

class Compute {
    
    public int largest(int arr[], int n)
    {
        int maxx = 0;
        for(int x : arr) maxx = Math.max(maxx, x);
        return maxx;
    }
}