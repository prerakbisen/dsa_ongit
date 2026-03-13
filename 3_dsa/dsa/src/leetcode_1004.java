public class leetcode_1004 {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int max1 = 0;
        int cnt1 = 0;
        int cnt0 = 0;
        for(int j= 0;j<nums.length;j++){
            if(nums[j]==1){
                cnt1++;
            }else{
                cnt0++;
            }
            while(cnt0>k){

                i++;
                if(nums[i-1]==1){
                    cnt1--;
                }else{
                    cnt0--;
                }
            }
            max1 = Math.max(max1, cnt1+cnt0);
        }
        return max1;
    }
}
