public class hollow_rectangle_pattern {
    public static void main (String args []){
        
        int rows = 4;
        int column = 5;
        
        for ( int i = 1; i <= rows; i++ ) {
            for ( int j = 1; j <= column; j++ ) {
                if ( i == 1 || i == rows || j == 1 || j == column) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
