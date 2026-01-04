public class string_q1 {
//    check that string is palindrome
    public static boolean check_palindrome(String s){
        int j = s.length()-1;
        int i = 0;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "madapm";
        System.out.println(check_palindrome(s));
    }
}
