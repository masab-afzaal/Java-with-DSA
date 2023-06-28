import java.util.*;

public class sumOfNumbers {
    public static void main(String args [] ) {
      
      System.out.print("Enter the Number : ");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int a=0;
      int b=0;
    
      for(int i=0; i<=n; i++) {
        if(i%2==0) {
          a +=i;
        }
        else{
          b+=i;
        }
      }
      int c = a + b;

      System.out.println("Sum of Even integers is : " + a);
      System.out.println("Sum of Odd integers is : " + b);
      System.out.println("Sum of All integers is : " + c);
  }
 }