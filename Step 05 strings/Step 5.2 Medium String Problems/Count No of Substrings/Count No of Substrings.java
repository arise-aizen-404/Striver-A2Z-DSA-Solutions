

//User function Template for Java

class Solution
{
    long substrCount (String s, int k) {
      return solve(s,k)-solve(s,k-1);
    }
    long solve(String s, int k) {
        int i=0,j=0,size=0,n=s.length();
        long ans=0;
        int[] map = new int[26];
        while(j<n) {
            char cha = s.charAt(j);
            if(map[cha-'a']==0) size++;
            map[cha-'a']++;
            while(size>k) {
                char chr = s.charAt(i);
                map[chr-'a']--;
                if(map[chr-'a']==0) size--;
                i++;
            }
            ans+=j-i+1;
            j++;
        }
        return ans;
    }
}