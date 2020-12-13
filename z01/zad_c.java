import java.util.Scanner;
public class zad_c {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz ilosc elementow");
        int n = input.nextInt();
        int x=0;
        int[] tablica = new int[n];

        System.out.println("Wprowadz elementy");
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = input.nextInt();
            if(Math.sqrt(tablica[i])%2==0)
                x=x+1;



        }
        System.out.println("Liczb ktore sa kwadratem liczby parzystej jest: " +x);
    }
}
