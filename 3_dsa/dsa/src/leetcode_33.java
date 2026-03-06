public class leetcode_33 {

        public static int search(int[] nums, int target) {
            int i =0;
            int j = nums.length-1;
            while(i<=j){
                int mid = i+(j-i)/2;

                if(nums[mid]==target){
                    return mid;
                }
                if(nums[mid]>=nums[i]){
                    if(target>=nums[i] && target<nums[mid]){
                        j = mid-1;
                    }
                    else{
                        i = mid+1;
                    }
                }else{
                    if(target>nums[mid]&& target<=nums[j]){
                        i=mid+1;
                    }else{
                        j = mid-1;
                    }
                }
            }
            return -1;
        }


    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(search(arr,3));
    }
}
