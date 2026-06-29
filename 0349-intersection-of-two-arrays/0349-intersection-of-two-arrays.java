class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i:nums1){
            set.add(i);
        }

        for(int j:nums2){
            if(set.contains(j)){
                list.add(j);
                set.remove(j);
            }
        }

        int[] intersection = new int[list.size()];
        int i=0;

        for(int n: list){
            intersection[i++] = n;
        }
        return intersection;
    }
}