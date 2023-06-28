import java.util.*;

public class container_with_most_water {
  //O(n^2) sub array approach
  public static int bruteForce(ArrayList<Integer> height){
    int maxwater=0;
    for(int i=0; i<height.size(); i++){
      for(int j=i+1; j<height.size(); j++){
        int h = Math.min(height.get(i), height.get(j));
        int w = j-i;
        int currwater = h*w;
        maxwater = Math.max(maxwater, currwater);
      }
    }
    return maxwater;
  }

  public static int optimize2Pointer(ArrayList<Integer> height){
    //O(n)
    int maxwater = 0;
    int lp = 0;
    int rp = height.size()-1;
    while(lp < rp){
      //calculate water area
      int h = Math.min(height.get(lp), height.get(rp));
      int w = rp-lp;
      int currsum = h*w;
      maxwater = Math.max(maxwater, currsum);

      //update ptr
      if(height.get(lp) < height.get(rp)){
        lp++;
      }
      else{
        rp--;
      }
    }
    return maxwater;
  }


  public static void main(String args []){
    ArrayList<Integer> height = new ArrayList<>();
    height.add(1);
    height.add(8);
    height.add(4);
    height.add(5);
    height.add(6);
    height.add(3);
    height.add(8);
    height.add(2);
    height.add(7);
    System.out.println(bruteForce(height));
    System.out.println(optimize2Pointer(height));
  }
}

