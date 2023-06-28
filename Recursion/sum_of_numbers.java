import java.util.*;
public class sum_of_numbers {
    public static int sumOfNum(int n){
        if(n == 1){
            return 1;
        }
        int sumOfNum_nm1 = sumOfNum(n-1);
        int sum = sumOfNum_nm1 + n;
        return sum;
    }
    public static void main(String args []) {
        int n = 5;
        System.out.println(sumOfNum(n));
    }
}