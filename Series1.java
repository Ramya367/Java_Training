public class Series1 {
    public static void main(String[] args){

        int k = 1;
        int until = 1000;
        double result = 1;

        for(int i = 1; i <= until; i++){
            result = result + 1 / i;
        }
        System.out.println(result);
    }

}
