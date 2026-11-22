class Solution {
    public int maxPower(String s) {
        int max = 0;
        int count = 1;
        int n = s.length();
        int i = 0;
        for(int j  =1;j<n;j++){
            if(s.charAt(i)==s.charAt(j)){
                count++;
                i++;
            }else{
                max = Math.max(max,count);
                i++;
                count =1;
            }

        }
        max = Math.max(max,count);
        return max;
    }
}