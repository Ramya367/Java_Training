public class Series2 {
    public static void main(String[] args) {
        double until = 10;
        double result = 1;
        int sign = 1;

        for (int i = 0; i < until; i++) {
           // System.out.println("Ramya");
            sign = sign*-1;
            System.out.println("sign: "+ sign);
            result = result + (i) * (sign);
        }
        System.out.println(result);
    }
    
}
