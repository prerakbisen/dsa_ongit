class Solution {
    public int maxProduct(int p) {
        String s = Integer.toString(p);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int n = arr.length;
        return (arr[n-1]-'0')*(arr[n-2]-'0');
    }
}