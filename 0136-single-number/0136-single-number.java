class Solution {
    public int singleNumber(int[] nums) {
        int i=0;
        for(int a:nums){
            i=i^a;
        }
        return i;
    }
}