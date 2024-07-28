class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(char x : s.toCharArray())
            hmap.put(x, hmap.getOrDefault(x, 0) + 1);
        for(char x :  t.toCharArray()) {
            if(hmap.get(x) != null && hmap.get(x) != 0)
                hmap.put(x, hmap.get(x) - 1); 
            else {
                return false;
            }
        }
        return true;
    }
}

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         int[] alphabet = new int[26];
//         for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
//         for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
//         for (int i : alphabet) if (i != 0) return false;
//         return true;
        
//         // Map<Character, Integer> map = new HashMap<>();
//         // for(int i=0;i<s.length();i++){
//         //     char ch = s.charAt(i);
//         //     if(!map.containsKey(ch)){
//         //         map.put(ch,1);
//         //     }else{
//         //         int n = map.get(ch)+1;
//         //         map.put(ch,n);
//         //     }
//         // }
//         // for(int i=0;i<t.length();i++){
//         //     char ch = t.charAt(i);
//         //     if(!map.containsKey(ch)){
//         //         return false;
//         //     }else{
//         //         int n = map.get(ch)-1;
//         //         if(n<0) return false;
//         //         map.put(ch,n);
//         //     }
//         // }
//         // for(Map.Entry<Character, Integer> entry: map.entrySet()){
//         //     if(entry.getValue() != 0) return false;
//         // }
//         // return true;
//     }
// }