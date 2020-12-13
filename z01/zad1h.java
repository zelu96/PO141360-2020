import java.util.Scanner;
public class zad1h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz ilosc elementow");
        int n = input.nextInt();
        int wynik=0;


        for(int i=1;i<=n;i++)
        {
            int x = input.nextInt();
            if(i%2==0)
            {
               x=x*(-1);
            }
            wynik=wynik+x;

        }
        System.out.println(wynik);

    }
}