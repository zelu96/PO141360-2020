import java.util.Scanner;
public class zad1c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz ilosc elementow");
        int n = input.nextInt();
        int wynik = 0;
        int z = 0;
        for(int i=0;i<n;i++)
        {
            z = input.nextInt();
            if(z<0)
                z=z*(-1);
            wynik=wynik+z;
        }
        System.out.println(wynik);

    }
}