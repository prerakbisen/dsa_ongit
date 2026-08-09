class Solution {
    public String reverseStr(String s, int k) {
        int tk = 2*k;
        int n = s.length();
        StringBuilder sb = new StringBuilder("");
        // StringBuilder temp = new StringBuilder("");
        int i = 0;
        while (tk <= n) {

            String sub = s.substring(i, tk);

            StringBuilder temp = new StringBuilder(sub.substring(0, k));
            temp.reverse();

            sb.append(temp);
            sb.append(sub.substring(k));

            i = tk;
            tk += 2 * k;
        }
        if (i < n) {

            String sub = s.substring(i);

            StringBuilder temp2;

            if (sub.length() >= k) {
                temp2 = new StringBuilder(sub.substring(0, k));
                temp2.reverse();

                sb.append(temp2);
                sb.append(sub.substring(k));
            } else {
                temp2 = new StringBuilder(sub);
                temp2.reverse();

                sb.append(temp2);
            }
        }
        return sb.toString();
    }
}