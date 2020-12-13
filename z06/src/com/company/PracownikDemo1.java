package com.company;

import java.time.LocalDate;
import java.util.*;

public class PracownikDemo1 {

    public PracownikDemo1(String nazwisko, double pobory, int year, int month, int day) {
        this.nazwisko = nazwisko;
        this.pobory = pobory;

        // klasa GregorianCalendar numeruje miesiące począwszy od 0
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);

        this.dataZatrudnienia = LocalDate.of(year,month,day);
        // dataZatrudnienia = new Date(year, month, day);
        // Powyższy konstruktor jest metodą odradzaną (ang. deprecated)
    }

    public String nazwisko() {
        return this.nazwisko;
    }

    public double pobory() {
        return this.pobory;
    }

    public LocalDate dataZatrudnienia() {
        // poniższa instrukcja umożliwia złamanie zasady hermetyzacji
        return this.dataZatrudnienia;

        // poprawna instrukcja:
        // return (Date) dataZatrudnienia.clone();
    }

    public void zwiekszPobory(double procent) {
        double podwyzka = this.pobory * procent / 100;
        this.pobory += podwyzka;
    }

    private String nazwisko;
    private double pobory;
    private LocalDate dataZatrudnienia;
}