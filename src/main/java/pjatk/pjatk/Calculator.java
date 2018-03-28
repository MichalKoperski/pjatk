package pjatk.pjatk;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Simple calculator. Confirm each number and symbol of an arithmetic operation by pressing enter");

        double x = scan.nextDouble();
        String s = scan.next();
        double y = scan.nextDouble();

        String s1 = "+";
        String s2 = "-";
        String s3 = "*";
        String s4 = "/";

        if(s.equals(s1)) {
            System.out.println("= "+(x+y));
        } else if(s.equals(s2)) {
            System.out.println("= "+(x-y));
        } else if(s.equals(s3)) {
            System.out.println("= "+(x*y));
        } else if(s.equals(s4)) {
            System.out.println("= "+(x/y));
        }
        scan.close();
    }
}