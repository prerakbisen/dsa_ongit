class Solution {
    public int maxLength(int[] nums) {
        
        int length = 1;
        int n = nums.length;
        
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int gcd = subgcd(nums, i , j);
                int p = pro(nums,i,j);
                int lcm = sublcm(nums,i,j);
                if(p == gcd * lcm){
                    length = Math.max(length, j-i+1);
                }
            }
        }
        return length;
        
    }
    public int pro(int[] pro, int i, int j){
        int p = 1;
        for(int k = i;k<=j;k++){
            p *=pro[k];
        }
        return p;
    }
    public int subgcd(int[] arr ,int i ,int j){
        int ans = arr[i];
        for(int k = i+1;k<=j;k++){
            ans = gcd(arr[k],ans);
        }
        return ans;
    }
    public int sublcm(int[] arr ,int i, int j){
        int ans = arr[i];
        for(int k = i+1;k<=j;k++){
            ans = (ans*arr[k])/( gcd(arr[k],ans));
        }
        return ans;
    }
    
    public int gcd(int a , int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a= temp;
        }
        return a;
    }
}