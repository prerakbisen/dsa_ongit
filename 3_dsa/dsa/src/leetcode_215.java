public class leetcode_215 {
    public static int findKthLargest(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int e:nums){
            if(e>max){
                max=e;
            }
        }
        for(int x:nums){
            if(x<max && x>smax){
                smax = x;
            }
        }
        return smax;

    }

    public static void main(String[] args) {
        int[] a = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(a,4));
    }
}
