import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(("Enter a number"));
        int num = input.nextInt();
        int org_num = num;
        int rev = 0;

        while (num!=0) {
            rev = rev*10 + num % 10;
            num = num/10;
        }
        if (rev == org_num){
            System.out.println("Given Number is Palindrome");
        } else {
            System.out.println("Given Number is not a Palindrome");
        }
        

    }
    
}
