package testpack;

import java.util.Scanner;

public class OperatorCls4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("a- ni daxil edin");
        int a = sc.nextInt();
        System.out.println("b ni daxil edin");
        int b = sc.nextInt();

        int netice = (a > b) ? 1000 : 2000;
        String netice1 = (a > b) ? "alma" : "armud";

        System.out.println("special int " + netice + " special string " + netice1);
    }
}
