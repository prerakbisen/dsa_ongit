import  java.util.*;
import  java.lang.*;
// wap to find missing no. in the continious sequence;
public class que_3 {
    public static void missing(int ...arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int n = max;
        int og_sum = (n*(min+max))/2;
        int current_sum =0;
        for(int e :arr){
            current_sum += e;
        }

        System.out.println("Missing Number is -"+ (og_sum-current_sum));

    }

    public static void main(String[] args) {
            int[] array = {1,2,3};
            missing(array);

    }
}
