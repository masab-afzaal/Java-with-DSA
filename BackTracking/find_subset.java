import java.util.*;
public class find_subset {
    public static void findsubset(String str, String ans, int i){
        //basecase
        //subsets find in basecase
        if(i == str.length() ){
            if( ans.length() == 0 ){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        // function calling yes and no
        findsubset(str, ans+str.charAt(i), i+1);
        findsubset(str, ans, i+1);
    }
    public static void main(String args []) {
        String str = "abc";
        findsubset(str,"",0);       
    }
}



