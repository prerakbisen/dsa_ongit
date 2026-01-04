public class learning_dsa_1 {
//    Question 1 : Print the number of 7’s that are in the 2d array.
//            Example :
//    Input - int[][] array = { {4,7,8},{8,8,7} };
//    Output - 2
    public static void count7(int [][]a){
        int c =0;
        for(int i =0 ;i< a.length;i++){
            for(int j =0;j< a[0].length;j++){
                if(a[i][j]==7){
                    c++;
                }
            }
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        int[][] array = { {4,7,8},{7,8,7} };
        count7(array);
    }
}
