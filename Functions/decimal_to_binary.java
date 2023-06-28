import java.util.*;

public class decimal_to_binary {
    
    public static void deciToBi ( int decimal ){
        int enter_decimal = decimal;
        int pow = 0;
        int binary = 0;
        while ( decimal > 0 ) {
            int reminder = decimal % 2;
            binary = binary + ( reminder * (int)Math.pow(10,pow));
            pow++;
            decimal /=2;
        }
        System.out.println("binary of " + enter_decimal + " = " + binary);
    }
    
    public static void main ( String args [] ) {
        Scanner sc = new Scanner ( System.in );
        
        int n = sc.nextInt();
        deciToBi(n);

        sc.close();
    }
}
