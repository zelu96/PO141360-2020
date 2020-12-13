package pl.imiajd.zelechowski;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Egz programowanie = new Egz();

        programowanie.dodaj("Kozik", "bdb");

        programowanie.dodaj("Guzik","dop");

        programowanie.dodaj("Pawcik","ndst");

        programowanie.dodaj("Lisiecki","dst");

        programowanie.wypisz();

        programowanie.usun("Pawcik");

        programowanie.zmien("Lisiecki","db");

        programowanie.wypisz();



        Egz2 po2= new Egz2();

        po2.dodaj(new Student("Jakub","Goralczyk",4),"db");

        po2.dodaj(new Student("Pawel","Kozicki",3),"dst");

        po2.dodaj(new Student("Jakub","Goralczyk",1),"bdb");

        po2.dodaj(new Student("Jakub","Pajer",2),"dop");

        po2.wypisz();

        po2.usun(3);

        po2.zmien(2,"bdb");

        po2.wypisz();



        Funkcja_Mieszajaca fm= new Funkcja_Mieszajaca(".txt");
    }
}
