public class leetcode_1614 {
    public static int maxDepth(String s) {
        int md =0;
        int d =0;
        for(int i =0;i<=s.length()-1;i++){
            if(s.charAt(i)=='('){
                d++;
                md = Math.max(md,d);
            }
            if(s.charAt(i)==')'){
                d--;
                md = Math.max(md,d);
            }

        }
        return md;
    }

    public static void main(String[] args) {
        String s = "(())((())())";
        System.out.println(maxDepth(s));
    }
}
