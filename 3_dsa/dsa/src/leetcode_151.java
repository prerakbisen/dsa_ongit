public class leetcode_151 {
    public static String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        int e = s.length() - 1;
        int j = e;
        for (int i = e; i >= 0; i--) {
            if (s.charAt(i)==' ') {
                sb.append(s.substring(i+1,j+1));
                sb.append(' ');
                j=i;
            }
            while(i>0 && s.charAt(i)==' '){
                i--;
                j=i;
            }
            if(i==0){
                sb.append(s.substring(i,j+1));
            }
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = " hello l  M Prerak     Bisen    ";
        System.out.println(reverseWords(s));
    }
}
