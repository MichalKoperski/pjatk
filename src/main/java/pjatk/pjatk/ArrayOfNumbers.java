package pjatk.pjatk;

import java.util.*;

class ArrayOfNumbers {
    static int[][] inner(int[][] numbers) {
        int[][] b = new int[numbers.length-2][numbers[0].length-2];

        for(int z = 1; z<numbers.length-1; z++) {
            for(int i = 1; i<numbers[0].length-1; i++) {
                b[z-1][i-1] = numbers[z][i];
            }
        }
        return b;
    }
    public static void main (String[] args) {
        int[][] a = {{1,2,3,4,5,6},
                     {2,3,4,5,6,7},
                     {3,4,5,6,7,8},
                     {4,5,6,7,8,9}};

        for(int[] r : a) {
            System.out.println(Arrays.toString(r));
        }
        System.out.println();
         for(int[] r : inner(a)) {
            System.out.println(Arrays.toString(r));
        }
    }
}