public class leetcode_11 {
    public static void maxArea(int[] height) {
        int max =0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int r= Math.max(i,j);
                int s= Math.min(i,j);
                if((j-i)*(height[r]-(height[r]-height[s]))>max){
                    max=(j-i)*(height[r]-(height[r]-height[s]));
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        maxArea(height);
    }
}
