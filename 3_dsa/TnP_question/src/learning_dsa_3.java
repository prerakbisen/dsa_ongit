public class learning_dsa_3 {
//     Write a program to Find Transpose of a Matrix.
    public static void main(String[] args) {
        int[][] nums = { {1,2,3},{4,5,6} };
        int a = nums[0].length;
        int b = nums.length;
        int [][] t=new int[a][b];
        for(int i =0 ;i< t.length;i++){
            for(int j =0;j< t[0].length;j++){
                t[i][j]=nums[j][i];
            }
        }

        for(int i =0 ;i< t.length;i++){
            for(int j =0;j< t[0].length;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }

    }
}
