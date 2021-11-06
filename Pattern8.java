public class Pattern8 {

    public static void main(String[] args) {
        int max_rows = 10;
        int first_half = max_rows/2;


        for( int row =1; row<=max_rows; row++){  // ROW

            // First half code starts here

            if(row<= first_half){
                
                for(int j=1;j<=first_half;j++){  // COl
                    
                    if(j<=first_half-row){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                System.out.print("\n");

            }
            // Second half code starts here
            else{

                for(int k=1;k<=first_half;k++){

                    if(k<= row-first_half){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }

                }
                System.out.print("\n");



            }


        }
        
        
        }
    }