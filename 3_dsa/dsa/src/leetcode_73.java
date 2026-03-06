public class leetcode_73 {
        public static void setZeroes(int[][] m) {
            int a = m.length;
            int b = m[0].length;
            int[] x = new int[a];
            int[] y = new int[b];
            int p =0;
            int q =0;
            for(int i =0;i<m.length;i++){
                for(int j =0;j<m[0].length;j++){
                    if(m[i][j]==0){
                        x[p]=i;
                        y[q]=j;
                        p++;
                        q++;
                    }
                }
            }
            p=0;
            q=0;
            for(int i =0;i<m.length;i++){
                for(int j =0;j<m[0].length;j++){
                    if(i ==x[p] && j ==y[q]){
                        for(int l =0 ; l<a;l++){
                            m[l][y[p]]=m[x[p]][y[q]];
                        }
                        for(int k =0 ; k<b;k++){
                            m[x[q]][k]=m[x[p]][y[q]];
                        }
                        p++;
                        q++;
                    }
                }
            }

            for(int i =0;i<m.length;i++) {
                for (int j = 0; j < m[0].length; j++) {
                    System.out.print(m[i][j]+" ");
                }
                System.out.println();
            }

        }

    public static void main(String[] args) {
        int [][] mat = {{0,1}};
        setZeroes(mat);
    }

}
