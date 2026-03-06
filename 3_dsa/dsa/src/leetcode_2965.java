import java.util.Arrays;
public class leetcode_2965 {

        public static int[] findMissingAndRepeatedValues(int[][] grid) {
            int[] no = new int[(grid.length)*(grid.length)];
            int [] ans = new int[2];
            for(int i =0; i<grid.length;i++){
                for(int j =0 ;j<grid.length;j++){
                    no[grid[i][j]-1]++;
                }
            }
            for(int k =0;k<no.length;k++){
                if(no[k]==2){
                    ans[0]=k+1;
                }
                if(no[k]==0){
                    ans[1]=k+1;
                }
            }
            return ans;
        }

    public static void main(String[] args) {
        int[][] a = {{1,2},{1,3}};
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(a)));
    }
}
