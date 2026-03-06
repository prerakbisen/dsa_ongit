public class leetcode_75 {
    public static void main(String[] args) {
            int [] a={1,0,2,1,1,0};
            sort(a);
    }
    public static void sort (int []a){
        int i =0;
        int j= a.length-1;
        int k;
        while(i<=j){
            if(a[i]>a[j]){
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
                k =i-1;
            } else {
                i++;
                k =i-1;
            }
            if( a[k]>a[i]){
                int temp = a[i];
                a[i]=a[k];
                a[k]=temp;
            }
        }
        for(int p=0;p<a.length;p++){
            System.out.println(a[p]);
        }
    }
}
