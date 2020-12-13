package pl.imiajd.zelechowski;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Osoba> listaOsob = new ArrayList<>(5);
        listaOsob.add(new Osoba("Obrycka", LocalDate.of(1999, 10, 15)));
        listaOsob.add(new Osoba("Ustymenko", LocalDate.of(1999, 10, 5)));
        listaOsob.add(new Osoba("Lewandowski", LocalDate.of(1994, 3, 18)));
        listaOsob.add(new Osoba("Blaszczykowski", LocalDate.of(1996, 9, 30)));
        listaOsob.add(new Osoba("Ustymenko", LocalDate.of(1994, 12, 1)));
        System.out.println(listaOsob.get(0));
        System.out.println(listaOsob.get(0).equals(listaOsob.get(1)));
        System.out.println(listaOsob.get(0).equals(listaOsob.get(4)));

        System.out.println(listaOsob);
        Collections.sort(listaOsob);
        System.out.println(listaOsob);

        //Zadanie 2

        ArrayList<Osoba> listaStudentow = new ArrayList<>(5);
        listaStudentow.add(new Student("Obrycka", LocalDate.of(1969, 12, 2), 3.09));
        listaStudentow.add(new Student("Ustymenko", LocalDate.of(1969, 12, 2), 4.76));
        listaStudentow.add(new Student("Lewandowski", LocalDate.of(1999, 2, 8), 4.0));
        listaStudentow.add(new Student("Blaszczykowski", LocalDate.of(1999, 2, 8), 5.0));
        listaStudentow.add(new Student("Ustymenko", LocalDate.of(1999, 12, 1), 3.89));

        System.out.println(listaStudentow);
        Collections.sort(listaStudentow);
        System.out.println(listaStudentow);

        // Zadanie 3
        if (args.length != 0) {
            ArrayList<String> zad3 = new ArrayList<>();
            try {
                File mojPlik = new File(args[0]);
                Scanner zczytywanie = new Scanner(mojPlik);
                while (zczytywanie.hasNextLine()) {
                    zad3.add(zczytywanie.nextLine());
                }
                zczytywanie.close();
            } catch (FileNotFoundException e) {
                System.out.println("Nie ma takiego pliku");
                e.printStackTrace();
            }

            System.out.println(zad3);
            Collections.sort(zad3);
            System.out.println(zad3);
        }
    }
}

