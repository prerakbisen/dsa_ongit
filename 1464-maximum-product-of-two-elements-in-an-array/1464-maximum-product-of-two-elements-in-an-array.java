class Solution {
    public int maxProduct(int[] nums) {
    //     int p =1;
    //     for(int i =0;i<nums.length;i++){
    //         for(int j =0;j<nums.length;j++){
    //             p = Math.max(p,( nums[i]-1)*(nums[j]-1));
    //         }
    //     }
    //     return p;

        Arrays.sort(nums);
        int n = nums.length;
        return (nums[n-1]-1)*(nums[n-2]-1);
    }
}