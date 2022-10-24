package testpack;

import java.util.Scanner;

public class OperatorCls5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("a- ni daxil edin");
        int a = sc.nextInt();
        System.out.println("b ni daxil edin");
        int b = sc.nextInt();
        System.out.println("c- ni daxil edin");
        int c = sc.nextInt();
        System.out.println("d ni daxil edin");
        int d = sc.nextInt();

        boolean netice = a > b || c <= d;
        System.out.println(netice);

    }
}
