public class pattern6 {
    public static void main(String[] args) {
        int k = 20;
        int total_rows = 2*k;

        for(int row=1; row<=total_rows; row++){

            if(row<=k){
                for(int col= 1; col<=row; col++){

                    System.out.print("*");
                    
    
                }
                System.out.print("\n");
            }
            else{            
                for(int col = 1; col<=k; col++){
                    System.out.print("*");                                    

                }
                k--;
                System.out.print("\n");
            }


        }
    
        
    }
}
