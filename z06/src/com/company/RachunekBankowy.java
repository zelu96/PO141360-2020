package com.company;

public class RachunekBankowy {


    static double rocznaStopaProcentowa;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void setRocznaStopaProcentowa(double rocznaStopaProcentowa) {
        RachunekBankowy.rocznaStopaProcentowa = rocznaStopaProcentowa;
    }

    private double saldo;

    public void obliczMiesieczneOdsetki(double saldo, double rocznaStopaProcentowa){
        double wynik = (saldo * rocznaStopaProcentowa) / 12;
        saldo += wynik;
        System.out.println(saldo);

    }
}
