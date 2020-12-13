package com.company;

import java.util.Random;
import java.util.Scanner;

public class Zadanie_1 {

    public static void main(String[] args) {
        System.out.println("Podaj n");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Podaj lewy");
        int lewy = s.nextInt() ;

        System.out.println("Podaj prawy");
        int prawy = s.nextInt();
        Random lotto = new Random();
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = lotto.nextInt(1999) - 1000;
        }
        int []f, g;
        f = tab.clone();
        g = tab.clone();
        int nieparzyste = 0, parzyste = 0, dodatnie = 0, ujemne = 0, zera = 0,
                najwiekszy = 0, powtorzony = 0, suma_ujemnych = 0, suma_dodatnich = 0, zlicz = 0, najdluzszy = 0;
        for (int i = 0; i < n; i++) {
            int e = tab[i];

            // a
            if (e % 2 == 0) parzyste++;
            else nieparzyste++;

            // b
            if (e > 0) {
                dodatnie++;
                f[i] = 1;
            }
            else if (e < 0) { ujemne++; f[i] = -1;}
            else zera++;

            // c
            if (najwiekszy < e) {
                powtorzony = 1;
                najwiekszy = e;
            } else if (najwiekszy == e) {
                powtorzony++;
            }

            // d
            if (e > 0) suma_dodatnich += e;
            else if (e < 0) suma_ujemnych += e;


            if (e > 0) zlicz++;
            else if (e < 0) zlicz = 0;

            if (zlicz > najdluzszy) najdluzszy = zlicz;

        }


        int i1 = prawy - lewy;
        for (int i = lewy; i <  lewy + i1 /2; i++) {
            int temp = g[i];
            g[i] = g[n - i -1];
            g[n-i-1] = temp;
        }

        StringBuilder string = new StringBuilder();
        string.append(" Zadanie 1\n")
                .append(String.format("a) parzyste %d, nieparzyste %d\n", parzyste, nieparzyste))
                .append(String.format("b) dodatnie %d, ujemne %d, zera %d\n",dodatnie, ujemne, zera ))
                .append(String.format("c) najwiekszy element %d, powtorzony %d razy\n", najwiekszy, powtorzony))
                .append(String.format("d) suma dodatnich %d, suma ujemnych %d\n", suma_dodatnich, suma_ujemnych))
                .append(String.format("e) Najdluzszy dodatni ciag elementow %d",najdluzszy));

        System.out.println(string.toString());

        System.out.println("Tablica zrodlowa:");
        for (int i = 0; i < n; i++) {
            System.out.println(tab[i]);
        }
        System.out.println("Tablica g:");
        for (int i = 0; i < n; i++) {
            System.out.println(g[i]);
        }
    }
}