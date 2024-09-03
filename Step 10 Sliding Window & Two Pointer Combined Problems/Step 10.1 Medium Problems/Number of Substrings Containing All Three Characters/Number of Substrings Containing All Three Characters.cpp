// This is a dummy .cpp file
class Solution {
public:
    int numberOfSubstrings(string s) {
        int left = 0;
        int right = 0;
        int *abc = new int[3]();
        int maxLen = 0;
        int count = 0;
        while (right < s.length()) {
            abc[s[right] - 'a']++;
            while (abc[0] && abc[1] && abc[2]) {
                abc[s[left++] - 'a']--;
            }
            count += left;
            right++;
        }
        return count;
    }
};