package nww;

public class Nww {

    public static void main(String[] args) {
        System.out.println(nww(24,36));
    }
    public static int nwd(int a, int b)
    {
        while(a != b)
        {
            if(a>b)
            {
                a-=b;
            }
            else
            {
                b-=a;
            }
        }
        return a;
    }
    public static int nww(int a, int b)
    {
        return a*b/nwd(a,b);
    }
}
