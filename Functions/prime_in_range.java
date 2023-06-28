import java.util.*;
public class prime_in_range {
    
    public static boolean isPrime ( int n ) {
        
        if ( n == 2 ) {
            return true;
        }
        else { 
            for ( int i = 2; i <= Math.sqrt(n); i++ ) {
                if ( n % i == 0 ) {
                    return false;
                }
            }
           
        }
       
        return true;
    }
    public static void primeInRange ( int n ) {
        for ( int i = 2; i <=n; i++ ) {
            if ( isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main ( String args [] ) {
        Scanner sc = new Scanner ( System.in );
        System.out.print("Enter a Numer to Find Range : ");
        int n = sc.nextInt();

        primeInRange(n);
    }
    
}
