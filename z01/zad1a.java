import java.util.Scanner;
public class zad1a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz ilosc elementow");
        int n = input.nextInt();
        int wynik=0;
        for(int i=0;i<n;i++)
        {
            wynik=wynik+input.nextInt();
        }
        System.out.println(wynik);

    }
}
