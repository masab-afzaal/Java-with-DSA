import java.util.*;
public class fibonacci {
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        return fibnm1 + fibnm2;
    }
    public static void main(String args []) {
        int n = 5;
        System.out.println(fib(n));
    }
}
