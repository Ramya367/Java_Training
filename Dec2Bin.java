
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Dec2Bin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.println(("Enter a number"));
        int num = input.nextInt();
    
        int remainder = 0;

        List<Integer> ints = new ArrayList<Integer>(); 

        while (num > 0) {

            remainder = num % 2;
            num = num / 2;

            System.out.println(remainder);
            System.out.println(num);
            ints.add(remainder);
           }
          Collections.reverse(ints);
          System.out.println(ints);





    }
}
