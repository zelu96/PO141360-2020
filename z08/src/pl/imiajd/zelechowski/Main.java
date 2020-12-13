package pl.imiajd.zelechowski;

import java.time.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Kozicki", new String[]{"Pawel"}, LocalDate.of(1999,2,8), false, 50000, LocalDate.of(2010,1,1));
        ludzie[1] = new Student("Lusa", new String[]{"Izabela","Agata"},LocalDate.of(1990,8,12),true, "informatyka",4.5);

        for (Osoba p : ludzie) {
            for ( String i : p.getImiona()){
                System.out.print(i+" ");
            }
            System.out.print(p.getNazwisko() + ": " + p.getOpis()+ " urodzony: "+p.getDataUrodzenia()+", plec: ");
            if(p.isPlec()){
                System.out.println("Kobieta");
            }
            else {
                System.out.println("Mężczyzna");
            }
        }
    }
}

