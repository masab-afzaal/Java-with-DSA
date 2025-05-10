import java.util.*;
public class factorial {
    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        int facnm1 = fact(n-1);
        int fac = facnm1 * n;
        return fac;
    }
    public static void main(String args []) {
        int n = 5;
        System.out.println(fact(n));
    }
}