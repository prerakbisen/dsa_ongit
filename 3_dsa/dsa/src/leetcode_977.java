import java.util.Arrays;

public class leetcode_977 {
    public static int[] sortedSquares(int[] a) {
        for(int i =0; i<a.length;i++){
            a[i]=a[i]*a[i];
        }
        Arrays.sort(a);

        return a;
    }

    public static void main(String[] args) {

    }
}
