package testpack;

import java.util.Scanner;

public class OperatorTask1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int eded = sc.nextInt();
        String netice = "";

        if (eded % 2 == 0) {
            netice = "Cut";
        } else {
            netice = "Tek";
        }

        System.out.println(netice);

    }
}
