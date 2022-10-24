package testpack;

import java.util.Scanner;

public class OperatorCls2 {

    public static void main(String[] args) {

        //menimsetme
        Scanner sc = new Scanner(System.in);
        System.out.println("a- ni daxil edin");
        int a = sc.nextInt();
        System.out.println("b ni daxil edin");
        int b = sc.nextInt();

        a = a % b; // a%=b

        System.out.println(a);
    }
}
