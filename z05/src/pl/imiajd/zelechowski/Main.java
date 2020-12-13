package pl.imiajd.zelechowski;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> lista_1= new ArrayList<>(Arrays.asList(1, 2, 2, 3, 9));

        ArrayList<Integer> lista_2= new ArrayList<>(Arrays.asList(2, 4, 6, 6, 7));

        System.out.println(lista_1);

        System.out.println(lista_2);

        System.out.println(z05.append(lista_1,lista_2));

        System.out.println(z05.merge(lista_1,lista_2));

        System.out.println(z05.mergeSorted(lista_1,lista_2));

        System.out.println(z05.reversed(lista_1));

        z05.reverse(lista_2);

        System.out.println(lista_2);
    }
}
