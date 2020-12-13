package com.company;
import java.util.Random;
public class Zadanie_3 {
    public static void main(String[] args) {
        Random r = new Random();
        int m = r.nextInt(10) + 1;
        System.out.println(m);
        int n = r.nextInt(10) + 1;
        System.out.println(n);
        int k = r.nextInt(10) + 1;
        int[][] a = new int[m][n];
        int[][] b = new int[n][k];
        for (int i = 0; i < a.length;i++){
            int[] jednowymiarowa = a[i];
            for (int j = 0; j < jednowymiarowa.length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(n);
        System.out.println(k);
        for (int i = 0; i < b.length;i++){
            int[] jednowymiarowa = b[i];
            for (int j = 0; j < jednowymiarowa.length;j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        int c[][]=new int[m][k];
        for(int i=0;i<m;i++){
            for(int j=0;j<k;j++){
                c[i][j]=0;
                for(int z=0;z<n;z++)
                {
                    c[i][j]+=a[i][z]*b[z][j];
                }
                System.out.print(c[i][j]+". ");
            }
            System.out.println();
        }


    }
}
