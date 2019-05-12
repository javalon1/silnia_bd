package Fib;

public class Fib {

    public static int fibonacci(int n)
    {
        if(n<=2)
        {
            return 1;
        }
        else
        {
            return fibonacci(n-2)+fibonacci(n-1);
        }
    }


    public static void main(String[] args) {
        System.out.println(fibonacci(7));

    }

}