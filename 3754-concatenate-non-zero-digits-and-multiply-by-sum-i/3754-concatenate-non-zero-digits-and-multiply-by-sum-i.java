class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb = new StringBuilder("");
        int sum =0;
        long x =0;
        while(n>0){
            int d = n%10;
            if(d!=0){
                sum +=d;
                sb.append(d);
            }
            n=n/10;

        }
        if(sb.length()!=0){
            sb.reverse();
           String ss= sb.toString();
            x=Long.parseLong(ss);
        }
        return sum * x;
        
    }
}