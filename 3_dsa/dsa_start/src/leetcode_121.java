public class leetcode_121 {
    public static int maxProfit(int[] p) {
        //   time limit exceeded
        /*int mf = Integer.MIN_VALUE;
        for(int i =0; i<p.length;i++){
            for(int j =i+1;j<p.length;j++){
                int profit = p[j]-p[i];

                if(profit > mf){
                    mf = profit;
                }
            }
        }
        if(mf <0){
            return 0;
        }*/
        // in less time complexity
        int bp = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i <p.length ; i++) {
            if(bp<p[i]){
                int profit = p[i] - bp;
                maxprofit = Math.max(maxprofit,profit);
            }else {
                bp = p[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int [] stocks ={7,1,5,3,6,4};
        System.out.println(maxProfit(stocks));
    }
}
