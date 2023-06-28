import java.util.*;

public class pair_sum_2 {
  public static boolean pairSum2(ArrayList<Integer> list, int target){
    // for sorted & rotated arraylist
    int bp = -1; // bp = Breaking Point
    int n = list.size();
    for(int i=0; i<list.size(); i++){
        if(list.get(i) > list.get(i+1)){
            bp = i;
            break;
        }
    }
    
    int lp = bp+1; //smallest
    int rp = bp; //largest

    while(lp != rp){
      if(list.get(lp) + list.get(rp) == target){
        return true;
      }
      else if(list.get(lp) + list.get(rp) < target){
        lp = (lp+1) % n;
      }
      else{
        rp = (n+rp-1) % n;
      }
    }


    return false;
  } 
 public static void main(String args []){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(11);
    list.add(12);
    list.add(13);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    list.add(10);
    
    int target = 16;
    System.out.println(pairSum2(list, target));
  }
}