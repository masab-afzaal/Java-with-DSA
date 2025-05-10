import java.util.*;
public class tower_of_hanoi {
    public static void ToH(int n, char scr, char dest, char hlpr){
        if(n == 1) {
            System.out.println("move disk " + n + " from " + scr + " to " + dest);
            return ;
        }
        ToH(n-1, scr, hlpr, dest);
        System.out.println("move disk " + n + " from " + scr + " to " + dest);
        ToH(n-1, scr, dest, scr);
        
    }
    public static void main(String args []) {
        int n = 3;
        ToH(n , 'A', 'B', 'C');
    }
}