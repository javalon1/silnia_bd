package saruss;

import java.util.Random;

public class Saruss {
    public static void main(String[] args) {
        int n =3;
        int [][] tab = new int[n][n];
        Random r = new Random();
        for(int i =0; i<n;i++)
        {
            for(int j = 0; j<n;j++)
            {
                tab[i][j]=r.nextInt(5);
                System.out.print(tab[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Wyznacznik macierzy obliczony metoda Sarussa wynosi: "+saruss(tab, n));
    }
    public static int saruss(int [][] tab, int n)
    {
        int a= 0;
        int b=0;
        for(int i =0; i<n; i++)
        {
            a +=tab[i][0]*tab[(i+1)%n][1]*tab[(i+2)%3][2];
            b +=tab[i][2]*tab[(i+1)%n][1]*tab[(i+2)%3][0];
        }
        return a-b;
    }
}
