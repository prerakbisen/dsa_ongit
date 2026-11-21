class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        Stack<Integer> stk = new Stack<>();
        stk.push(nums[0]);
        int max = 0;
        int count = 0;
        if(nums[0]==1)count++;
        for(int i=1;i<nums.length;i++){
            if(stk.peek()==1&&nums[i]==1){
                count++;
                stk.push(nums[i]);
            }else if(stk.peek()!=1 && nums[i]==1){
                count++;
            }
            else{
                max = Math.max(max,count);
                stk.push(nums[i]);
                count = 0;
            }
        }
        max = Math.max(max,count);
        return max;
    }
}