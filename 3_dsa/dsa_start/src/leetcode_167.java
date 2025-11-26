import java.util.Arrays;

public class leetcode_167 {
    public static int[] twoSum(int[] a, int t) {
        int i = 0;
        int j = a.length-1;
        while(i<j){
            int sum = a[i]+a[j];
            if(a[i]+a[j]==t){
                return new int[]{i,j};
            } else if (sum >t) {
                j--;
            } else if (sum<t) {
                i++;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
            int []a={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(a ,9)));
    }
}
