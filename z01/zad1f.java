import java.util.Scanner;
public class zad1f {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz ilosc elementow");
        int n = input.nextInt();
        double wynik = 0;
        double z = 0;
        for(int i=0;i<n;i++)
        {
            z = input.nextDouble();

            wynik=wynik+(z*z);
        }
        System.out.println(wynik);

    }
}