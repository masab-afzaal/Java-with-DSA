import java.util.*;
public class binary_to_decimal {
    
    public static void biToDeci ( int binary ){
        int enter_binary = binary;
        int pow = 0;
        int decimal = 0;
        while ( binary > 0 ) {
            int lastDigit = binary % 10;
            decimal = decimal + (int)( lastDigit * Math.pow(2,pow));
            pow++;
            binary /=10;
        }
        System.out.println("Decimal of " + enter_binary + " = " + decimal);
    }
    public static void main ( String args [] ) {
        Scanner sc = new Scanner ( System.in );
        System.out.print("Enter decimal number : ");
        int n = sc.nextInt();
        biToDeci(n);
    }
}
