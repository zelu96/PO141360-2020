package pl.imiajd.zelechowski;

public class Main {

    public static void main(String[] args) {
        Adres ad1 = new Adres("Długa", "10", "18-400", "Lomza");
        Adres ad2 = new Adres("Długa", "10", "4", "18-400", "Lomza");
        Adres ad3 = new Adres("Długa", "10", "4", "18-400", "Lomza");
        ad1.pokaz();
        ad2.pokaz();
        System.out.println(ad1.przed(ad2));
        System.out.println(ad1.przed(ad3));
        Osoba Jakub = new Osoba("Kozicki", 1996);
        Student Pawel = new Student("Goralczyk", 1992, "Prawo");
        Nauczyciel Michal = new Nauczyciel("Labuda", 1973, 2300);
        System.out.println(Jakub);
        System.out.println(Pawel);
        System.out.println(Michal);
        System.out.println(Pawel.getKierunek());
        System.out.println(Pawel.getNazwisko());
        System.out.println(Pawel.getRokUrodzenia());
        System.out.println(Michal.getPensja());
        BetterRectangle prostokat = new BetterRectangle(1, 1, 4, 3);
        System.out.println(prostokat.getArea());
        System.out.println(prostokat.getPerimeter());
    }
}
