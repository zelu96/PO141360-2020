package pl.imiajd.zelechowski;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
            LinkedList<String> pracownicy = new LinkedList<>();
            pracownicy.add("Igor");
            pracownicy.add("Jakub");
            pracownicy.add("Pawel");
            pracownicy.add("Mikolaj");
            pracownicy.add("Sylwester");
            pracownicy.add("Zdzislaw");
            pracownicy.add("Kamil");
            pracownicy.add("Jacek");
            System.out.println(pracownicy);
            z12.redukuj(pracownicy, 2);
            System.out.println(pracownicy);
            LinkedList<Integer> liczby = new LinkedList<>();
            liczby.add(1);
            liczby.add(2);
            liczby.add(3);
            liczby.add(4);
            liczby.add(5);
            liczby.add(6);
            liczby.add(7);
            liczby.add(8);
            liczby.add(9);
            System.out.println(liczby);
            z12.redukuj(liczby, 2);
            System.out.println(liczby);
            z12.odwroc(pracownicy);
            System.out.println(pracownicy);
            z12.odwroc(liczby);
            System.out.println(liczby);
            System.out.println(z12.mistrz_yoda("Ala ma kota. Jej kot lubi myszy."));
            z12.cyfry(2015);
            z12.Erastotenes(100);
            HashSet<LocalDate> daty = new HashSet<>();
            daty.add(LocalDate.of(1999, 1, 25));
            daty.add(LocalDate.of(1999, 5, 5));
            daty.add(LocalDate.of(1999, 2, 7));
            daty.add(LocalDate.of(1999, 6, 3));
            daty.add(LocalDate.of(1999, 5, 15));
            daty.add(LocalDate.of(1999, 10, 1));
            daty.add(LocalDate.of(1999, 8, 17));
            z12.print(liczby);
            z12.print(pracownicy);
            z12.print(daty);
        }
    }

