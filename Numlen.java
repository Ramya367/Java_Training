import java.util.Scanner;

public class Numlen {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int qt = num;
        int i = 1;
        while (qt >= 10) {
            qt = num/10;
            num = qt;
            i++;
        }
        System.out.println(i);

}
}
