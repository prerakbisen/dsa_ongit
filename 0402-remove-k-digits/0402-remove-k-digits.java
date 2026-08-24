class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder stk = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            while (stk.length() > 0 &&
                   k > 0 &&
                   stk.charAt(stk.length() - 1) > ch) {

                stk.deleteCharAt(stk.length() - 1);
                k--;
            }
            stk.append(ch);
        }
        while (k > 0) {
            stk.deleteCharAt(stk.length() - 1);
            k--;
        }
        int start = 0;
        while (start < stk.length() && stk.charAt(start) == '0') {
            start++;
        }
        String result = stk.substring(start);
        return result.isEmpty() ? "0" : result;
    }
}