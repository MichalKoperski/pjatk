package pjatk.pjatk;

import java.util.*;

class Cross {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scan.nextInt();
        scan.close();

        for(int len=0; len<n; len++) {
            for(int i=0; i<n; i++)
                System.out.print(" ");
            for(int i=0; i<n; i++)
                System.out.print("*");
            System.out.println();
        }
        for(int len=0; len<n; len++) {
            for(int i = 0; i<3*n;i++)
                System.out.print("*");
            System.out.println();
        }
        for(int len=0; len<n; len++) {
            for(int i=0; i<n; i++)
                System.out.print(" ");
            for(int i=0; i<n; i++)
                System.out.print("*");
            System.out.println();
        }
    }
}
