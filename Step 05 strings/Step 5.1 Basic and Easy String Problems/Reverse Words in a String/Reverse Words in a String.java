// class Solution {
//     public String reverseWords(String s) {
//        String words[]=s.trim().split(" +");
//         Collections.reverse(Arrays.asList(words));
//         return String.join(" ",words);
//     }
// }

// class Solution {
//     public String reverseWords(String s) {
//         String[] parts = s.split(" ");
//         int left = 0;
//         int right = parts.length - 1;
//         while (left < right) {
//             // Swap the elements at left and right indices
//             String temp = parts[left];
//             parts[left] = parts[right];
//             parts[right] = temp;
//             // Move the indices toward the center
//             left++;
//             right--;
//         }
//         StringBuilder sb = new StringBuilder();
//         for(String x : parts) {
//             if(!x.equals("")) sb.append(x+" ");
//         }
//         String x = new String(sb);
//         return x.stripTrailing();
//     }
// }

class Solution {
    public String reverseWords(String s) {
        // String[] words = s.trim().split(" +");
        // Collections.reverse(Arrays.asList(words));
        // return String.join(" ", words);
        
        String [] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int end = words.length - 1;
        for(int i = 0; i<= end; i++){
            if(!words[i].isEmpty()) {
                sb.insert(0, words[i]);
                if(i < end) sb.insert(0, " ");
            }
        }
        return sb.toString();
    }
}