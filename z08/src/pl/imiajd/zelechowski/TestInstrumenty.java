package pl.imiajd.zelechowski;
import java.time.LocalDate;

import java.util.ArrayList;



public class TestInstrumenty {

    public static void main(String[] args) {

        ArrayList<Instrument> orkiestra = new ArrayList<>();

        orkiestra.add(new Fortepian("Fortepian", LocalDate.of(1980,2,20)));

        orkiestra.add(new Skrzypce("Skrzypce", LocalDate.of(1580,6,27)));

        orkiestra.add(new Skrzypce("Skrzypce", LocalDate.of(1580,6,27)));

        orkiestra.add(new Flet("Flecik", LocalDate.of(2020,5,10)));

        orkiestra.add(new Fortepian("Fortepian", LocalDate.of(2018,2,8)));

        for(Instrument ins: orkiestra){

            System.out.print(ins.dzwiek()+" ");

            System.out.println(ins);

        }

        System.out.println(orkiestra.get(0).equals(orkiestra.get(4)));

        System.out.println(orkiestra.get(1).equals(orkiestra.get(2)));

        System.out.println(orkiestra.get(3).getProducent());

        System.out.println(orkiestra.get(3).getRokProdukcji());

    }

}