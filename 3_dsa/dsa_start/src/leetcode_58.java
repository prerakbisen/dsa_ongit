public class leetcode_58 {
    public static void main(String[] args) {
        String s = "   hello world    ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int wl =0;
        String ns = s.trim();
        int j = ns.length()-1;

        while (ns.charAt(j)!=' '){
            wl++;
            j--;
        }
        return wl;
    }
}
