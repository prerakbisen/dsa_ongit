class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] d = arr.clone();
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.sort(d);
        HashMap<Integer,Integer> map = new HashMap<>();
        int r =1;
        for(int i =0;i<n;i++){
            if(!map.containsKey(d[i])){
                map.put(d[i],r++);
            }
        }
        for(int i=0;i<n;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;

    }
}