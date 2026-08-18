class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i =0;
        int j = k-1;
        while(j<nums.length){
           
            HashSet<Integer> set = new HashSet<>();

            for (int p = i; p <= j; p++) {
                set.add(nums[p]);
            }

            for (int num : set) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            i++;
            j++;
            
        }
        int max = -1;
        for(int key : map.keySet()){
            if(map.get(key)==1){
                max = Math.max(max,key);
            }
        }
        return max;
    }
}