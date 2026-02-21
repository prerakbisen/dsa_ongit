public class string_compression {
    public static void compress(String s) {
        StringBuilder sb = new StringBuilder("");
        sb.append(s.charAt(0));
        int counter =1;
        for(int i = 1 ; i<s.length();i++){

            if(s.charAt(i)==s.charAt(i-1)){
                counter++;
            }
            else{
                sb.append(counter);
                sb.append(s.charAt(i));
                counter= 1;
            }

        }
        sb.append(counter);
        if(sb.length()>s.length()){
            System.out.println(s);
        }else {
            System.out.println(sb);
        }
    }

    public static void main(String[] args) {
        String s = "aaabbbcccdddde";
        String s2 = "aabc";

        compress(s2);
    }
}
