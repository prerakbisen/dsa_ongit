class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        int i = 0;
        int j = x/2;
        while(i<=j){
            int mid = i+(j-i)/2;
            long sq = (long)mid*mid;
            
            if (sq == x) {
                return mid;
            } else if (sq < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return j;
    }
}