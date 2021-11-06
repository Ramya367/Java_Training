public class MinHour {
    public static void main(String[] args) {
        int seconds = 10000;
        int minutes = seconds / 60;
        int mins = minutes % 60;
        int sec = seconds % 60;

        int hours = minutes / 60;



        System.out.println(hours+":"+mins+":"+sec);
     

    }
}
