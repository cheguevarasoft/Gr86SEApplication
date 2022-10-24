package testpack;

import java.util.Scanner;

public class OperatorCls3 {

    public static void main(String[] args) {

        //qarshilashdirma
        Scanner sc = new Scanner(System.in);
        System.out.println("a- ni daxil edin");
        int a = sc.nextInt();
        System.out.println("b ni daxil edin");
        int b = sc.nextInt();

        boolean c = a > b;

        System.out.println(c);
    }
}
