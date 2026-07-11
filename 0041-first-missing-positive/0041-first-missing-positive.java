class Solution {
    public int firstMissingPositive(int[] nums) {
        // int pmin = 1;
        // int i = 0;
        // while(i<nums.length){
        //     if(nums[i]==pmin){
        //         pmin++;
        //     }
        //     // if(nums[i]<=0){
        //     //     i++;
        //     // }
        //     i++;
        // }
        // return pmin;
        Arrays.sort(nums);
        int pmin = 1;
        for (int n : nums) {
            if (n == pmin) {
                pmin++;
            } else if (n > pmin) {
                return pmin;
            }
        }
        
        return pmin;  

    }
}