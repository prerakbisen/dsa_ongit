public class leetcode_125 {
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i =0;
        int j = s.length()-1;
        while(i<=j){
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("a big brown fox jumps over the lazy dog"));
    }
}
