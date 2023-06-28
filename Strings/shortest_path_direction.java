import java.util.*;
public class shortest_path_direction {
    public static float shortestPath (String path) {
        int x=0, y=0;
        for(int i=0; i<path.length(); i++) {
            char dir = path.charAt(i);
            if(dir == 'N') {
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'W'){
                x++;
            } 
            else if(dir == 'E'){
                x--;
            }
        }
        x = x*x; y= y*y;
        return (float)Math.sqrt(x+y);
        
    }
    public static void main(String args []) {
        String path = "WNEENESENNNE";
        System.out.println( shortestPath(path));
       
    }
}