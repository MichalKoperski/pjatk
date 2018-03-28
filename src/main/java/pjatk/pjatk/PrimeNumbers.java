package pjatk.pjatk;

import javax.swing.JOptionPane;

public class PrimeNumbers {

    public static void main(String[] args) {

        String s = JOptionPane.showInputDialog(null,"Enter an integer");
        int a = Integer.parseInt(s);
        s = JOptionPane.showInputDialog(null,"Enter an integer");
        int b = Integer.parseInt(s);
        int counter=0;
        MAIN_LOOP:
        for(int z=a; z<=b; z++) {
            if(a>b) {
                break;
            }
            if(z==2) {
                counter++;
            }
            if (z%2 == 0) {
                continue;
            } else {
                int p = 3;
                while (p*p <= z) {
                    if (z%p == 0) {
                        continue MAIN_LOOP;
                    }
                    p += 2;
                } counter++;
            }
        }
        if (a>b ) {
            JOptionPane.showMessageDialog(null, "Error! Second Integer must be greater then first one!");
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "["+a+", "+b+"] contains "+counter+" prime numbers");
        System.exit(0);
    }
}