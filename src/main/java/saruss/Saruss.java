package saruss;

public class Saruss {
    public static void main(String[] args) {
        int n =3;
        int [][] tab = new int[n][n];
    }
    public static int saruss(int [][] tab, int n)
    {
        int a =1;
        int b = 1;
        int det =0;
        int wynik = 0;
        for(int i = 0;i<tab.length;i++)
        {
            for(int j =0; j<tab.length;j++)
            {
                a *= tab[i][j];
                b *= tab[i+1][j];
            }
            wynik +=det;
        }
        return wynik;
    }
}
