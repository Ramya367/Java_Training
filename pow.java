public class pow {
    public static void main(String[] args) {

        int x = 3;
        int pow = 4;
    
        int result = 1;

       // for (int i = 1; i <=pow; i++) {
      //      result = result*x;
      //  }
        int i= 1;
        while (i <= pow){
            result= result * x;
            i++;
        }
        System.out.println(result);
    }
}
