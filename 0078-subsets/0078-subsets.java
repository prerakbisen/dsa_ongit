class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        rec(lst, ans, nums, 0);
        return ans;
    }
    void rec(List<Integer> l , List<List<Integer>> il, int [] arr , int idx){
         if (idx == arr.length) {
            il.add(new ArrayList<>(l));  
            return;
        }

        // TAKE arr[idx]
        l.add(arr[idx]);
        rec(l, il, arr, idx + 1);
        l.remove(l.size() - 1);           // backtrack

        // SKIP arr[idx]
        rec(l, il, arr, idx + 1);
    }
}