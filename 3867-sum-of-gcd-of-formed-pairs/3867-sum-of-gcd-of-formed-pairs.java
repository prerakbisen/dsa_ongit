class Solution {
    public  int gcd(int a, int b) {
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] pg = new int[n];
        int mx = nums[0];
        for(int i = 0; i < n; i++){
            mx = Math.max(mx, nums[i]);
            pg[i] = gcd(nums[i], mx);
        }

        Arrays.sort(pg);
        int i = 0;
        int j = n-1;
        long sum = 0;
        while(i<j){
            sum = sum + gcd(pg[i],pg[j]);
            i++;
            j--;
        }
        return sum;
    }
}