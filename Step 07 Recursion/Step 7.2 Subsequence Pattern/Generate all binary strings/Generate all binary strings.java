

//User function Template for Java

class Solution {
  public static void myHelper(List<String> res, int num, String str) {
        if (num == 0) {
            res.add(str);
            return;
        }
        myHelper(res, num - 1, str + "0");
        if (str.isEmpty() || str.charAt(str.length() - 1) != '1') {
            myHelper(res, num - 1, str + "1");
        }
    }

    public static List<String> generateBinaryStrings(int num) {
        List<String> res = new ArrayList<>();
        if (num < 1) return res;
        myHelper(res, num, "");
        return res;
    }
}
     
     