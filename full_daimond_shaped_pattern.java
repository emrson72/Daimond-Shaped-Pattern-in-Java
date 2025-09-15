public class full_daimond_shaped_pattern {
    
    public static void main(String args[]){
        int n = 5;

// Top part of the Daimond

           // responsible for the 5 rows
           for(int i = 0; i < n; i++){   

                // prints the spaces until loop completes, the spaces (j) decreases as i increases
                for(int j = 0; j < n - i; j++){  
                    System.out.print(" ");
                    }
                        // prints the stars, starts with 1 and increments in each cycle of loop
                        for(int k = 0; k < (2 * i) + 1; k++){ 
                            System.out.print("*");
                    }

                       System.out.print("\n");
           }
       

// Bottom Part of the Daimond

            // responsible for the remaining 4 rows in the bottom part
            for(int i = n - 2; i >= 0; i-- ){
                 
                // this prints two spaces (increasing) for the bottom part
                // i here is i = 3;
                for(int j = 0; j < n - i; j++){
                    System.out.print(" ");
                }

                    // this prints 7 stars, then 5 stars, then 3 stars, then 1 stars, as i decreases on each loop
                    for(int k = 0; k < ( 2 * i ) + 1; k++){
                        System.out.print("*");
                    }
                       System.out.print("\n");
            }                 
     }   
}

