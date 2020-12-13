import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz ilosc elementow");
        int n = input.nextInt();
        int[] tablica = new int[n];
        System.out.println("Wprowadz elementy");

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = input.nextInt();


        }
        int x = tablica[0];
        tablica[0]=tablica[tablica.length-1];
        tablica[tablica.length-1]=x;
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i]+ " ");

        }

    }
}