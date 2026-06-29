class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        // for(int i=0;i<nums1.length;i++){
        //     list1.add(nums1[i]);
        // }
        for(int i=0;i<nums2.length;i++){
            list2.add(nums2[i]);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            if(list2.contains(nums1[i])){
                set.add(nums1[i]);
            }
        }
        int [] ans = new int[set.size()];
        int i =0;
        for(int nums:set){
            ans[i]=nums;
            i++;
        }
        return ans;
    }
}