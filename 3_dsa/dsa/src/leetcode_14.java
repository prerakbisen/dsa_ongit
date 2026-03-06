import java.util.Arrays;
public class leetcode_14 {
    public static StringBuilder longestCommonPrefix(String[] strs) {
//        StringBuilder sb = new StringBuilder();
        StringBuilder sb= new StringBuilder("");
        int min =Integer.MAX_VALUE;
        for(String e:strs){
            if(e.length()<min){
                min = e.length();
            }
        }
        Arrays.sort(strs);
        String p = strs[0];
        String q = strs[strs.length-1];
            for(int i = 0 ;i<=min;i++){
                if(p.charAt(i)==q.charAt(i)) {
                    sb.append(p.charAt(i));
                }else {
                    return sb;
            }
        }

            return sb;
    }
    // better approach
    /*public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb= new StringBuilder("");

        Arrays.sort(strs);
        String p = strs[0];
        String q = strs[strs.length-1];
        for(int i = 0 ;i<=Math.min(p.length(),q.length());i++){
            if(p.charAt(i)==q.charAt(i)) {
                sb.append(p.charAt(i));
            }else {
                return sb.toString();
            }
        }

        return sb.toString();
    }*/

    public static void main(String[] args) {
        String[] s = {"flower","flow","floight"};
        System.out.println(longestCommonPrefix(s));
    }
}
