class Solution {
    public int minimizeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int A = nums[n-1]-nums[2];
        int B = nums[n-2]-nums[1];
        int C = nums[n-3]-nums[0];
        return Math.min(Math.min(A,B),C);

    }
}