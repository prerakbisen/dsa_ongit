class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int a:nums){
            min = Math.min(min,a);
            max = Math.max(max,a);
        }
        while(max>0){
            int temp = max;
            max = min % max;
            min = temp;
        }
        return min;
    }
}