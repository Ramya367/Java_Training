public class Pattern11 {
    public static void main(String[] args) {
        int lim = 20;

        for (int i = 0; i <=lim; i++) {
            for(int j = 0; j <=lim; j++) {

                if(j<=i || j>=lim-i){
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
