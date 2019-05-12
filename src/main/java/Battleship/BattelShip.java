package Battleship;

import java.util.Random;

public class BattelShip {
    public static void createShips(char [][] tab)
    {
        Random r= new Random();
        //Rysuje czteromasztowce
        int a = r.nextInt(10);
        int b = r.nextInt(10);
        //System.out.println(a);
        //System.out.println(b);

        for(int i =0; i<tab.length;i++)
        {
            for(int j=0; j<tab.length;j++)
            {
                tab[i][j]='#';
            }
        }


        if((a>=4 && a<=5) && (b>=4 && b<=5))
        {
            if(Math.random()<0.25)
            {
                for(int i=a;i<a+4;i++)
                {
                    tab[i][b]='*';
                    /*tab[i+1][b+1]='~';
                    tab[i+1][b]='~';
                    tab[i+1][b-1]='~';
                    tab[i-1][b+1]='~';
                    tab[i-1][b]='~';
                    tab[i-1][b-1]='~';
                    tab[i][b-1]='~';
                    tab[i][b+1]='~';*/
                }
            }
            else if(Math.random()>=0.25 && Math.random()<0.5)
            {
                for(int i=a-4;i<a;i++)
                {
                    tab[i][b]='*';
                   /* tab[i+1][b+1]='~';
                    tab[i+1][b]='~';
                    tab[i+1][b-1]='~';
                    tab[i-1][b+1]='~';
                    tab[i-1][b]='~';
                    tab[i-1][b-1]='~';
                    tab[i][b-1]='~';
                    tab[i][b+1]='~';*/
                }
            }
            else if(Math.random()>=0.5 && Math.random()<0.75)
            {
                for(int i=b; i<b+4;i++)
                {
                    tab[a][i]='*';
                    /*tab[a+1][i+1]='~';
                    tab[a+1][i]='~';
                    tab[a+1][i-1]='~';
                    tab[a-1][i+1]='~';
                    tab[a-1][i]='~';
                    tab[a-1][i-1]='~';
                    tab[a][i-1]='~';
                    tab[a][i+1]='~';*/
                }
            }
            else
            {
                for(int i=b-4;i<b;i++)
                {
                    tab[a][i]='*';
                    /*tab[a+1][i+1]='~';
                    tab[a+1][i]='~';
                    tab[a+1][i-1]='~';
                    tab[a-1][i+1]='~';
                    tab[a-1][i]='~';
                    tab[a-1][i-1]='~';
                    tab[a][i-1]='~';
                    tab[a][i+1]='~';*/
                }
            }
        }
        else
        {
            if(a<4)
            {
                //Obsluga pierwszej cwiartki
                if(b<4)
                {
                    if(Math.random()<=0.5)
                    {
                        for(int i = b; i<b+4;i++)
                        {
                            tab[a][i]='*';
                        }
                    }
                    else
                    {
                        for(int i =a; i<a+4;i++)
                        {
                            tab[i][b]='*';
                        }
                    }
                }
                //Obsluga drugiej cwiartki
                else if(b>5)
                {
                    if(Math.random()<=0.5)
                    {
                        for(int i = b-4; i<b;i++)
                        {
                            tab[a][i]='*';
                        }
                    }
                    else
                    {
                        for(int i =a; i<a+4;i++)
                        {
                            tab[i][b]='*';
                        }
                    }
                }
                //obsluga paska pomiedzy pierwsza a druga cwiartka
                else
                {
                    if(Math.random()<=0.33)
                    {
                        for(int i = b-4; i<b;i++)
                        {
                            tab[a][i]='*';
                        }
                    }
                    else if(Math.random()>0.33 && Math.random()>=0.67)
                    {
                        for(int i=b; i<b+4;i++)
                        {
                            tab[a][i]='*';
                        }
                    }
                    else
                    {
                        for(int i=a;i<a+4;i++)
                        {
                            tab[i][b]='*';
                        }
                    }
                }
            }
            else if(a>5)
            {
                //obsluga trzeciej cwiartki
                if(b<4)
                {
                    if(Math.random()<=0.5)
                    {
                        for(int i =a-4; i<a;i++)
                        {
                            tab[i][b]='*';
                        }
                    }
                    else
                    {
                        for(int i =b; i<b+4;i++)
                        {
                            tab[a][i]='*';
                        }
                    }
                }
                else if(b>5)
                {
                    if(Math.random()<=0.5)
                    {
                        for(int i =a-4; i<a;i++)
                        {
                            tab[i][b]='*';
                        }
                    }
                    else
                    {
                        for(int i =b-4; i<b;i++)
                        {
                            tab[a][i]='*';
                        }
                    }
                }
                else
                {
                    if(Math.random()<=0.33)
                    {
                        for(int i = b-4; i<b;i++)
                        {
                            tab[a][i]='*';
                        }
                    }
                    else if(Math.random()>0.33 && Math.random()>=0.67)
                    {
                        for(int i=b; i<b+4;i++)
                        {
                            tab[a][i]='*';
                        }
                    }
                    else
                    {
                        for(int i=a-4;i<a;i++)
                        {
                            tab[i][b]='*';
                        }
                    }
                }

            }
            else
            {
                if(b<4)
                {
                    if(Math.random()<=0.33)
                    {
                        for(int i = a-4; i<a;i++)
                        {
                            tab[i][b]='*';
                        }
                    }
                    else if(Math.random()>0.33 && Math.random()>=0.67)
                    {
                        for(int i=a; i<a+4;i++)
                        {
                            tab[i][b]='*';
                        }
                    }
                    else
                    {
                        for(int i=b;i<b+4;i++)
                        {
                            tab[a][i]='*';
                        }
                    }
                }
                else if(b>5)
                {
                    if(Math.random()<=0.33)
                    {
                        for(int i = a-4; i<a;i++)
                        {
                            tab[i][b]='*';

                        }
                    }
                    else if(Math.random()>0.33 && Math.random()>=0.67)
                    {
                        for(int i=a; i<a+4;i++)
                        {
                            tab[i][b]='*';

                        }
                    }
                    else
                    {
                        for(int i=b-4;i<b;i++)
                        {
                            tab[a][i]='*';
                        }
                    }
                }
            }
        }
        for(int i =0; i<tab.length;i++)
        {
            for(int j=0; j<tab.length;j++)
            {
                System.out.print(tab[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        char [][] tab = new char[10][10];
        createShips(tab);
    }

}
