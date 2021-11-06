public class lcd {
    

    public static void main(String[] args) {

        
     int num1 = 6;
     int num2 = 9;
     int min = 0;
   

     if (num1 % 2 == 0 && num2 % 2 == 0) {
         System.out.println("LCM is 2");
        }
        else {
            if (num1 - num2 > 0){
               min = num2;
            }
            else {
               min = num1;
            }
            
            System.out.println(min);

            for (int i = 3; i <= min; i= i+2) {
                if (num1 % i == 0 && num2 % i == 0){
                    System.out.println(i);
                }
                
            }
            
        }
        
    }
}
