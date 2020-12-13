package com.company;

public class Main {

    public static void main(String[] args) {
	RachunekBankowy saver1 = new RachunekBankowy();
	RachunekBankowy saver2 = new RachunekBankowy();

	saver1.obliczMiesieczneOdsetki(2000,0.04);
	saver2.obliczMiesieczneOdsetki(300,0.04);

    }
}
