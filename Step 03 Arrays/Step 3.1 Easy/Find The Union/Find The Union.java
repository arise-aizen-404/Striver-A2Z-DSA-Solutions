

//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays
class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        SortedSet <Integer>set = new TreeSet <>();
        for(int i :arr1){
            set.add(i);
        }
        for(int i :arr2){
            set.add(i);
        }
        ArrayList<Integer> l = new  ArrayList<Integer>();
         for(int  i :set){
           l.add(i);
        }
        return l;
    }
}

