public class leetcode_1903 {

        public static String largestOddNumber(String s) {
            // StringBuilder sb = new StringBuilder("");
            if((s.charAt(s.length()-1)-'0')%2!=0){
                // sb.append(s);
                return s;
            }else{
//                for(int i =0; i<s.length();i++){
                    for(int i =s.length()-1;i>=0;i--){
                    if((s.charAt(i)-'0')%2!=0){
                        //   sb.append(s.substring(0,i+1));
                        return s.substring(0,i+1);
                    }
                }

            }
            return "";


        }


    public static void main(String[] args) {
        String s = "10133890";
        System.out.println(largestOddNumber(s));
    }
}
