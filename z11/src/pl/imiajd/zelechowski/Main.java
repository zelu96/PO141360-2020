package pl.imiajd.zelechowski;

import java.time.LocalDate;

import java.util.ArrayList;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<LocalDate> lD = new ArrayList<>();

        lD.add(LocalDate.of(1999,8,2));

        lD.add(LocalDate.of(1999,7,2));

        lD.add(LocalDate.of(1999,8,1));

        System.out.println(ArrayUtil.isSorted(lD));

        Collections.sort(lD);

        System.out.println(ArrayUtil.isSorted(lD));

        ArrayList<Integer> i = new ArrayList<>();

        i.add(4);

        i.add(8);

        i.add(2);

        i.add(6);

        i.add(2);

        i.add(1);

        i.add(2);

        i.add(8);

        i.add(5);

        System.out.println(ArrayUtil.isSorted(i));

        Collections.sort(i);

        System.out.println(ArrayUtil.isSorted(i)+"\n");

        System.out.println(ArrayUtil.binSearch(i,8));

        System.out.println(ArrayUtil.binSearch(i,10));

        System.out.println(ArrayUtil.binSearch(lD,LocalDate.of(1999,8,1)));

        System.out.println(ArrayUtil.binSearch(lD,LocalDate.of(1999,1,2))+"\n");

        ArrayUtil.selectionSort(lD);

        ArrayUtil.selectionSort(i);

        ArrayUtil.mergeSort(lD);

        ArrayUtil.mergeSort(i);

        System.out.println(lD);

        System.out.println(i+"\n");
    }
}
