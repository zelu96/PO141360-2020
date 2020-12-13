import java.util.Scanner;
public class zad_b {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz ilosc elementow");
        int n = input.nextInt();
        int x=0;
        int[] tablica = new int[n];

        System.out.println("Wprowadz elementy");
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = input.nextInt();
            if(tablica[i]%3==0 && tablica[i]%5!=0)
                x=x+1;



        }
        System.out.println("Liczb podzielnych przez 3 i niepodzielnych przez 5 jest: " +x);
    }
}
