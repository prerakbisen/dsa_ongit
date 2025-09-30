import  java.util.*;
import java.lang.*;
public  class que_2 {
    public static void pow_sum(int ...a){
        int p =0;
        int q = a.length-1;
        int x =0;
        while (p<q){
            x += (int) Math.pow(a[p],a[q]);
            p++;
            q--;
        }
        if (p==q){
            x= x+a[p];
        }
        System.out.println(x);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,2,4};
        pow_sum(arr);

    }
}