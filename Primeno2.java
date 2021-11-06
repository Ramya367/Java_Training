import java.time.Duration;
import java.time.Instant;

public class Primeno2 {
    public static void main(String[] args){
        double range = 10000;
        Instant s = Instant.now();

        for(int i = 3; i <= range; i++){
            if(i%2 == 0){

                 } 


            else{
               int remainder = 1;
               int j = i-1;
               while(remainder > 0 && j > 1){
                   remainder = i % j;
                   j--;
               } 
               if(remainder != 0){
                   System.out.println(i+ " Is a prime number");

               }
               

            }

        }
        Instant e = Instant.now();
        long timeElapsed = Duration.between(s, e).toMillis();  //in millis

        System.out.println(timeElapsed+" milliseconds");

    }
    
}
