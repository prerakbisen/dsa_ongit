public class Ld_4 {
//    sum of  diagonal elements of matrix;
public static void main(String[] args) {
    int[][] t = { {1,4,9},{11,4,3},{2,2,3} };
    int sum=0;
    for(int i =0 ;i< t.length;i++){
        for(int j =0;j< t[0].length;j++){
            if(i==j){
                sum = sum +t[i][j];
            }
        }
    }
    System.out.println(sum);
}
}
