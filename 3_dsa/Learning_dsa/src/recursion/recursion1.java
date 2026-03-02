package recursion;

public class recursion1 {
    //   Que 1 - to print no. in increasing order
    public static void inc_order(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        inc_order(n-1);
        System.out.print(n+" ");
    }

    //   Que 2 - factorial

    public static int fac(int n){
        if(n==0){

            return 1;
        } else if (n==1) {
            return 1;
        }
        int pren = fac(n-1);
        int  ans = n * pren;
        return ans;
    }
    //   Que 3 - sum of N no.
    public static int sum(int n){
        if(n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }
        int pre_sum = sum(n-1);
        int  ans = n  + pre_sum;
        return ans;
    }
    //   Que 4 - nth fibonaci no..
    public static int fibo(int n){
        if(n==0){
            return 0;
        }else if (n==1) {
            return 1;
        }
        int  ans =  fibo(n-1) + fibo(n-2);
        return ans;
    }

    //    Que 5 check sorted array
    public static boolean isSort(int  a[], int i){
        if(i==a.length-1){
            return true;
        }
        if(a[i] > a[i+1]){
            return  false;
        }
        return isSort(a,i+1);
    }


    public static void main(String[] args) {
        inc_order(5);
        int [] a = {1,2,3,4,5,};
        System.out.println(fac(5));
        System.out.println(sum(5));
        System.out.println(fibo(5));
        System.out.println(isSort(a,0));
    }
}
