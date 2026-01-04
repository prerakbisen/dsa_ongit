import java.util.*;
public class String_q2_shortest_path_with_given_direction {
//    Given a route containing 4 directions (E, W, N, S),
//find the shortest path to reach destination.
//"WNEENESENNN"
public static void main(String[] args) {
    String d = "WNEENESENNN";
    int x =0 ;
    int y =0 ;
    for(int i =0; i<d.length();i++){
        char var = d.charAt(i);
        switch (var){
            case 'E':
                x++;
                break;
            case 'W':
                x--;
                break;
            case 'N':
                y++;
                break;
            case 'S':
                y--;
                break;
        }
    }
    int sort_dist = (int) Math.sqrt((x*x)+(y*y));
    System.out.println(sort_dist);
}

}
