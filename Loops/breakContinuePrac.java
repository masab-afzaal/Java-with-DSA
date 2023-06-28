import java.util.*;

public class breakContinuePrac {
    public static void main ( String args [] ) {
        Scanner sc = new Scanner(System.in);
       
        
        // BREAK
        while (true) {
            System.out.println("Enter a Numbers : ");
            int n = sc.nextInt();
            if ( n % 10 == 0 ){
                break;
            }
            System.out.println("Your Number is : " + n);
        }
        
        // CONTINUE
        for ( int i = 1; i<=5; i++) {
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
        
        
    }
}