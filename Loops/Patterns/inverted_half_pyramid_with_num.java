public class inverted_half_pyramid_with_num {
    public static void main (String args []){
            
        int rows = 5;
        
        
        for ( int i = 1; i <= rows; i++ ) {
    
            for ( int j = 1; j <= rows-i+1; j++ ) {
                System.out.print(j);
                
            }
            System.out.println();
        }

    }
 
}

