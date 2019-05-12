package Fib;

import java.util.Scanner;

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

 public static void Fib()
 {
     Scanner s = new Scanner(System.in);
     int n = s.nextInt();

     if(n<2)
     {
         System.out.println(n);
     }
     else{
         int a =0;
         System.out.println(a);
         int b = 1;
         System.out.println(b);
         int c = 1;
         System.out.println(c);
         int k =2;
         while(k<n)
         {
             a = b;
             b=c;
             System.out.println(c= a+b);
             k++;

         }
             //System.out.println(c);
     }
 }
    public static void main(String[] args) {
        //System.out.println(fibonacci(7));
        System.out.println("Podaj liczbe z jakiego zakresu chcesz wyznaczyc ciag Fibonnaciego");
        Fib();

    }

}