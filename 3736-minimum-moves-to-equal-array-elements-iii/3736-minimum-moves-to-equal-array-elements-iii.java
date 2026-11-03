class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        for(int a: nums){
            if(a>max){
                max = a;
            }
        }
        int count = 0;
        for(int b :nums){
            
            while(b!=max){
                b = b+1;
                count++;
            }
        }
        return count;

    }
}