public class lcm {
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 9;
        int max = 0;
        int min = 0;
        

        max = findMax(num1, num2);
        min = findMin(num1, num2);
        int product = max;

        while (product % min != 0) {
            product = product + max;
           
        }
        System.out.println(product);

        
    }

    private static int findMin(int num1, int num2) {
        if (num1 - num2 > 0){
            return num2;
        } else {
            return num1;
        }
    }

    private static int findMax(int num1, int num2) {
        if (num1 - num2 > 0){
            return num1;
        } else {
            return num2;
        }
        
    }
    
}
