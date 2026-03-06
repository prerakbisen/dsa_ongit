public class leetcode_1752 {
    public static boolean check(int[] a) {
        int i=0;
        int j=1;
        while(j<a.length){
            if(a.length==2 ){
                return true;
            }
            if(a[i]<=a[j] || a[i++]<=a[j++]){
                return true;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a = {3};
        System.out.println(check(a));
    }
}
