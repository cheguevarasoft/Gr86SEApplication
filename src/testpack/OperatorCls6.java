package testpack;

import java.util.Scanner;

public class OperatorCls6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("a- ni daxil edin");
        int a = sc.nextInt();
        System.out.println("b ni daxil edin");
        int b = sc.nextInt();

        int c = 0;

        if (a > b) {
            c = a + b;
        } else if (a < b) {
            c = a - b;
        } else {
            c = a * b;
        }

        System.out.println(c);

    }

}
