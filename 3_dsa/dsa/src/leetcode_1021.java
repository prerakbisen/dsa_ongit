public class leetcode_1021 {

        public static String removeOuterParentheses(String s) {
            StringBuilder sb = new StringBuilder("");
            int c=0;
            int st=0;
            for(int i =0;i<s.length();i++){
                sb.append(s.charAt(i));
                if(s.charAt(i)=='('){
                    c++;
                }
                if(s.charAt(i)==')'){
                    c--;
                    if(c==0){
                        sb.deleteCharAt(st);
                        sb.deleteCharAt(i);
                        st=i+1;
                    }
                }



            }
            return sb.toString();
        }

    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }

}
