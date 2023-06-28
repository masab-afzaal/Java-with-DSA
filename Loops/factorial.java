import java.util.*;
public class factorial {
    public static void main( String args[] ) {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Enter a Number : ");
        
        double n = sc.nextDouble();
        double a = 1;
        double i;
        
        for (  i = 1; i <= n; i++ ) {
            a = a*i;
        }
       
        System.out.println("total "+a);

    }
}
