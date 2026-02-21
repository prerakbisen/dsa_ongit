public class learning_dsa_2 {
//    Question 2 : Print out the sum of the numbers in the second row of the “nums” array.
//            Example :
//    Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
//    Output - 18
    public static void sumof2row(int[][]a){
        int s =0;
        int i =1;
            for(int j =0;j< a[0].length;j++){
                s = s+a[i][j];
            }
        System.out.println(s);

    }

    public static void main(String[] args) {
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        sumof2row(nums);
    }
}
