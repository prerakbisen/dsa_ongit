class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        // int max = Integer.MIN_VALUE;
        // for(int a:nums){
        //     max = Math.max(max,a);
        // }
        int n = nums.length;
        Arrays.sort(nums);
        // int max = nums[n-1];
        int a = 0;
        for(int i=1;i<=n;i++){
            while(a<n && nums[a]< i){
                a++;
            }
            if(a == n || nums[a]!=i){
                list.add(i);
            }
             
           
        }
        return list;
    }
}