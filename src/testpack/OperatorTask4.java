package testpack;

import java.util.Scanner;

public class OperatorTask4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("esas meblegi daxil edin");
        double esas = sc.nextDouble();
        double ferq = 0;
        double odenilecek = 0;

        if (esas > 0 && esas <= 300) {
            ferq = esas * 0.05;
        } else if (esas > 300 && esas <= 500) {
            ferq = esas * 0.1;
        } else if (esas > 500 && esas <= 700) {
            ferq = esas * 0.15;
        } else {
            ferq = esas * 0.20;
        }

        odenilecek = esas - ferq;
        System.out.println("odenilecek mebleg : " + odenilecek);

    }

}
