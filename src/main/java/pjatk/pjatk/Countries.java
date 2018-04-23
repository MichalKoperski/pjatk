package pjatk.pjatk;

import java.util.*;

class Countries {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a country and I will tell you its capital");
        String choice=scan.next();

        int counter=0;
        String capital="";

        String[][] countries = {{"Poland", "Warsaw"},
                {"Germany", "Berlin"},
                {"USA", "Washington"},
                {"Spain", "Madrid"},
                {"France", "Paris"},
                {"Russia", "Moscow"}};

        for(String[] k: countries) {
            counter++;
            for(int i=0; i<countries[i].length; i++) {
                if(choice.equals(k[i])) {
                    capital = k[1];
                    System.out.println("The capital of "+choice+" is "+capital);
                }
            }
            if(counter==countries.length&&capital.equals("")) {
                System.out.println("No country in a database");
            }
        }
    }
}
