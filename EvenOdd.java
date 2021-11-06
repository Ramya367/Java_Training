public class EvenOdd {
    public static void main(String[] args) {
    int in = 20;

    for (int i = 1; i < in; i++)
    if (i % 2 != 0) 
    {
        System.out.println("This is odd" + i );
    }
    else
    {
        System.out.println("This is even" + i);
    }
    
}
}