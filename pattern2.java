public class pattern2 {
    public static void main(String[] args) {
        int num = 1;

        for (int i = 1; i<= 6; i++) {

            for(int j =1; j<=6; j++){

                if(j > num){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            num++;
            System.out.print("\n");
        }
        
    }
}
