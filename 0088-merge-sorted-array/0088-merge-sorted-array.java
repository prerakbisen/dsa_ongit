class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int i = m;
        int j=0;
        while(i<a.length && j<n){
            a[i] = b[j];
            i++;
            j++;
        }
        Arrays.sort(a);
    }
}