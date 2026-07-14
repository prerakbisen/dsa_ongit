class Solution {
    public int removeCoveredIntervals(int[][] A) {
        Arrays.sort(A, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);
        // Arrays.sort(A, (a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
        int res = 0, r = 0;

        for (int[] x : A) {
            if (x[1] > r) {
                r = x[1];
                res++;
            }
        }

        return res;
    }
}