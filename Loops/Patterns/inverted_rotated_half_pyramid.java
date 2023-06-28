public class inverted_rotated_half_pyramid {
    public static void main (String args []){
            
        int rows = 4;
        
        
        for ( int i = 1; i <= rows; i++ ) {
            
            for ( int j = rows - 1; j >= i; j--) {
                System.out.print(" ");
            }
            
            // We can also use this logic to generate space
            // for ( int j = 1; j <= rows-i; j++) {
            //     System.out.print(" ");
            // }
            
            for ( int j = 1; j <= i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
 
}
