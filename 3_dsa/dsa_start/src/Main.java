import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        Arrays.sort(strs);
        for (int i =0; i<strs.length;i++){
            System.out.println(strs[i]);
        }

        StringBuilder sb = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hell");
        sb2 =sb;
        System.out.println(sb2);
    }
}