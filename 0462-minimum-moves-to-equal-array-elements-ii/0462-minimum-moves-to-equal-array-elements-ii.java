import java.util.Arrays;

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        
        int median = nums[nums.length / 2];
        int count = 0;
        
        for (int a : nums) {
            count += Math.abs(a - median);
        }
        
        return count;
    }
}