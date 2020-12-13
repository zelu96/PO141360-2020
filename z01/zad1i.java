import java.util.Scanner;
public class zad1i {
    private static int silnia(int z)
    {
        if (z < 1)
            return 1;
        else
            return z * silnia(z-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz ilosc elementow");
        int n = input.nextInt();
        int wynik=0;



        for(int i=1;i<=n;i++)
        {
            int x = input.nextInt();
            if(i%2==1)
            {
                x=(x*(-1));
            }
            System.out.println(silnia(i));
            x=x/silnia(i);
            wynik=wynik+x;

        }
        System.out.println(wynik);

    }
}