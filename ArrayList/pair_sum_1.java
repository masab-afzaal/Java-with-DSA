import java.util.*;

public class pair_sum_1 {
  public static boolean pairSum1(ArrayList<Integer> list, int target){
    //for sorted arraylist
    int lp = 0;
    int rp = list.size()-1;

    while(lp != rp){
      if(list.get(lp) + list.get(rp) == target){
        return true;
      }
      else if(list.get(lp) + list.get(rp) < target){
        lp++;
      }
      else{
        rp--;
      }
    }

    return false;
 }
 public static void main(String args []){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    int target = 15;
  System.out.println(pairSum1(list, target));
  }
}

