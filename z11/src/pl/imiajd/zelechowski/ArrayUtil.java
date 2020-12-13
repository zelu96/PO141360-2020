package pl.imiajd.zelechowski;

import java.util.ArrayList;

import java.util.Collections;



public class ArrayUtil {

    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> tab){

        ArrayList<T> temp= new ArrayList<>(tab);

        Collections.sort(temp);

        return tab.equals(temp);

    }

    public static <T extends Comparable<? super T>> int binSearch(ArrayList<T> tab, T a){

        if(ArrayUtil.isSorted(tab)){

            int l = 0;

            int r = tab.size() - 1;

            while (l <= r) {

                int m = l + (r - l) / 2;

                if (tab.get(m).equals(a))

                    return m;

                if (tab.get(m).compareTo(a)<0)

                    l = m + 1;

                else

                    r = m - 1;

            }

        }

        return -1;

    }

    public static <T extends Comparable<? super T>> void selectionSort(ArrayList<T> tab){

        int najwieksze;

        T temp;

        for (int i=tab.size()-1; i>=0 ;i--)

        {

            najwieksze=0;

            for (int j=0; j<=i; j++)

            {

                if (tab.get(najwieksze).compareTo(tab.get(j))<0)

                {

                    najwieksze=j;

                }

            }



            if (najwieksze!=i)

            {

                temp=tab.get(i);

                tab.set(i,tab.get(najwieksze));

                tab.set(najwieksze,temp);

            }

        }

    }

    public static <T extends Comparable<? super T>>  void mergeSort(ArrayList<T> tab){

        if (tab.size() > 1) {

            ArrayList<T> left = new ArrayList<>();

            ArrayList<T> right = new ArrayList<>();

            boolean logicalSwitch = true;

            while (!tab.isEmpty()) {

                if (logicalSwitch) {

                    left.add(tab.remove(0));

                } else {

                    right.add(tab.remove(tab.size()/2));

                }

                logicalSwitch = !logicalSwitch;

            }

            mergeSort(left);

            mergeSort(right);

            while (!left.isEmpty() && !right.isEmpty()) {

                if(left.get(0).compareTo(right.get(0)) <= 0){

                    tab.add(left.remove(0));

                }

                else {

                    tab.add(right.remove(0));

                }

            }

            if(!left.isEmpty()){

                tab.addAll(left);

            }

            else if (!right.isEmpty()){

                tab.addAll(right);

            }

        }

    }

}