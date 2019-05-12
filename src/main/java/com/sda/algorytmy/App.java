package com.sda.algorytmy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println(rek(5));
    }
    public static int rek(int n)
    {
       if(n<2)
       {
           return 1;
       }

       return n*rek(n-1);

    }

}
