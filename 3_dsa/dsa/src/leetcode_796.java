public class leetcode_796 {
    public static boolean rotateString(String s, String goal) {
        /*StringBuilder s1 = new StringBuilder("");
        StringBuilder s2 = new StringBuilder("");
        s1.append(s);
        int i = s1.length()-1;
        while(s1.toString() !=goal){
            s2.append(s1.charAt(i));
            s2.append(s1.substring(0,i));
            s1=s2;
            if(s1.toString()==goal){
                return true;
            }
        }
        return false;*/
        // WRONG APPROACH

        if (s.length() != goal.length()) return false;

        String doubled = s + s;
        return doubled.contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String g = "cdeab";
        System.out.println(rotateString(s,g));
    }
}
