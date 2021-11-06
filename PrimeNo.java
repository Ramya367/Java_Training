import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(("Enter a number"));
        int num = input.nextInt();

        for(int i= num; i > 1; i--) {
            if(i%2 !=  0) {
                int k = 1;
                for(int j= i-1; j > 1; j--) {
                  double rem = i%j;
                  k = (int) (k * rem);  
                }
                if(k != 0) {
                    System.out.println(i);
                }
                
            }

        }


}
}