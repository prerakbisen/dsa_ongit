public class string_q2_string_comparision {
//    String comparision
    public static void main(String[] args) {
        String  [ ]fruits= {"apple", "mango",  "banana","kivi"};
        String max = fruits[0];
        for(int i =1 ;i<fruits.length;i++){
            if(max.compareTo(fruits[i])<0){
                max = fruits[i];
            }
        }
        System.out.println(max);
    }
}
