class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();
        int mid = (n-1)/2;
        String sub = "";
        if(n%2==0){
            char[] c = s.substring(0,mid+1).toCharArray();
            Arrays.sort(c);
            sub=  new String(c);
        }else{
            char[] c = s.substring(0,mid).toCharArray();
            Arrays.sort(c);
            sub = new String(c);
        }
        
        int i = 0;
        int j = n-1;
       
            while(i<j){
                for(int k = 0;k<sub.length();k++){
                    sb.setCharAt(i,sub.charAt(k));
                    i++;
                    sb.setCharAt(j,sub.charAt(k));
                    j--;
                }
            }
        
           
        
        return sb.toString();
        
    }
}