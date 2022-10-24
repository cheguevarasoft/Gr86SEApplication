package testpack;

import java.util.Scanner;

public class LoopsCls54 {

    public static void main(String[] args) {

        int netice = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("starti daxil edin");
        int start = sc.nextInt();
        System.out.println("endi daxil edin");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {

            netice = netice + i;//netice+=i
        }

        System.out.println(netice);

    }
}
