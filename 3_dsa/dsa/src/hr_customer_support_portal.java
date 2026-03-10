import java.io.*;
import java.util.*;
public class hr_customer_support_portal {




        public static  void back(int n){
            Queue<Integer> q = new LinkedList<>();
            Scanner sc = new Scanner(System.in);
            for(int i = 0; i<n ;i ++){

                int no = sc.nextInt();
                if(no == 1 ){
                    int id = sc.nextInt();
                    q.add(id);
                }else if(no == 2){
                    if(!q.isEmpty()){
                        q.poll();
                    }

                }else if(no == 3){
                    if(q.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(q.peek());
                    }

                }
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            back(n);
        }


}
