import java.util.Arrays;

public class leetcode_que4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);
        float median = 0f;
        if(merged.length%2!=0){
            median = merged[ ( (merged.length-1)/2 )];
        }
        else{
            median = ( merged[ ( (merged.length-1)/2 )]+ merged[ ( ((merged.length-1)/2)+1 )])/2f;
        }
        return median;

    }

    public static void main(String[] args) {
        int [] arr1 = {1,5,9,7};
        int[] arr2 = {2,6,7,9};
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }
}
