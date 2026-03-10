import java.io.*;
import java.util.*;
public class hr_cafeteria {

        public static int sand(int[] std , int[]sand ){
            int sni = 0;
            int r =0;
            Queue<Integer> q = new LinkedList<>();
            for(int s : std){
                q.add(s);
            }
            while(r<q.size() && !q.isEmpty()){
                if(q.peek()==sand[sni]){
                    q.poll();
                    sni++;
                    r=0;
                }else{
                    int f = q.poll();
                    q.add(f);
                    r++;
                }
            }
            return q.size();

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] student = new int[n];
            int [] san = new int [n];
            for(int i =0;i<n;i++){

                student[i]= sc.nextInt();
            }
            for(int i =0;i<n;i++){

                san[i]= sc.nextInt();
            }
            System.out.println(sand(student, san));

        }


}

