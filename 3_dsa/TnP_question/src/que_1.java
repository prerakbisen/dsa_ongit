
public class que_1 {
    public static void palin(String ...a){
        String max = "";
        String min = "null ";
        for(String s:a){
            if (s.length()>max.length()){
                max = s;
            }
            if (min == null || s.length() < min.length()) {
                min = s;
            }

        }
        System.out.println("maximum length palindrom :-  "+ max);
        System.out.println("minimum length palindrom :- "+ min);

    }
    public static void main(String[] args) {
        String arr[] = {"civic","madam","mom","dad","refer","noon","rotator","deed","level"};
        palin(arr);
    }
}
