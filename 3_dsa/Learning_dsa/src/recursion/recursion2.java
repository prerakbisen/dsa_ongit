package recursion;

public class recursion2 {
//    que 11  remove duplicate from string
    public static String removedup(String s, int i, StringBuilder sb, boolean[] map){
        if(i == s.length()){
            return sb.toString();
        }

        if(map[s.charAt(i)-'a']){
            return removedup(s,i+1,sb,map);
        }else {
            map[s.charAt(i)-'a']=true;
            sb.append(s.charAt(i));
            return removedup(s,i+1,sb,map);
        }
//        return sb.toString();

    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(removedup(s,0,new StringBuilder(""),new boolean[26]));
    }
}
