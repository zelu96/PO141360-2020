import java.util.Scanner;
public class zad1g {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz ilosc elementow");
        int n = input.nextInt();
        int wynik1=0;
        int wynik2=1;
        for(int i=0;i<n;i++)
        {
            wynik1=wynik1+input.nextInt();
            wynik2=wynik2* input.nextInt();
        }
        System.out.println(wynik1);
        System.out.println(wynik2);

    }
}