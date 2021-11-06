public class factorial {
    public static void main(String[] args) {

        int fact = 3;
        int result = 1;

       // for (int i = 1; i <= fact; i++) {
        //    result = result * i;
      //  }
        int i = 1;
        while (i <= fact){
            result = result * i;
            i++;
            System.out.println(result);
        }
       
    }
    
}
