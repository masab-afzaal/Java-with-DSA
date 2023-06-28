import java.util.*;
public class Binomial_Coefficient {
    
    public static int factorial ( int n ) {
        int a = 1;
        for ( int i = 1; i<=n; i++) {
            
            a = a * i;    
        }
        return a;
    }
    public static int binCoeff (int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nMr = factorial(n-r);
        int binCoeff = fact_n / ( fact_r * fact_nMr);
        return binCoeff;
    }
    
    public static void main(String args []) {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Enter n & r : ");
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(binCoeff(n, r));
        
       
        
    }
}
