class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        long ans =0;
        int sign = 1;
        int j = 0;
        if(s.length() ==0){
            return 0;
        }else if(s.charAt(j)=='-' ){
                sign = -1;
                j++;
        }else if(s.charAt(j)=='+'){
            j++;
        }
        
        for(int i=j;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int digit = s.charAt(i)-'0';
                ans = (ans *10) + digit;
                if (sign * ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (sign * ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }else{
               break;
            }
        }
        
        return (int)ans*sign;
    }
}