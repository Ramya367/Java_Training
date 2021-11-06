public class Pattern7 {
    public static void main(String[] args) {
        int max_rows = 10;

        for (int i = 1; i <= max_rows; i++) {

            for (int j = 1; j<=max_rows; j++) {
                if(j <= max_rows-i){
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
