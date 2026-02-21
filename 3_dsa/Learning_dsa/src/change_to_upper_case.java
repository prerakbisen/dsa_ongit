public class change_to_upper_case {
    public static String upper_case(String str){
        StringBuilder sb = new StringBuilder("");
        char ch =Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i =1 ;i <str.length();i++){
            char c = str.charAt(i);

            if(str.charAt(i)==' '){
                sb.append(' ');
                c = Character.toUpperCase(str.charAt(i+1));
                i++;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "hello world hi, my name is prerak bisen";
        System.out.println(upper_case(s));
    }
}
