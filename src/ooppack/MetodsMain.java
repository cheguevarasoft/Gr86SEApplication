package ooppack;

import java.util.Scanner;

public class MetodsMain {

    //camel case almaArmudNar variable, methodname
    //pascal case AlmaArmudNar

    //geriye deyer qaytarmayan bosh
    static void yaz() {

        System.out.println("Afqan Cafarov");
    }

    //geriye deyer qaytarmayan parametrli
    static void yazdir(String metn) {

        System.out.println(metn);
    }

    //geriye deyer qaytaran bosh

    static int topla() {

        int netice = 40 + 50;

        return netice;
    }

    //geriye deyer qaytaran parametrli
    static int vurma(int a, int b) {
        int netice = a * b;
        return netice;
    }

    static String musMen(int a) {

        String netice = "";
        if (a > 0) {
            netice = "musbet";
        } else if (a < 0) {
            netice = "Menfi";
        } else {
            netice = "Sifir";
        }

        return netice;
    }

    static boolean cutdurmu(int eded) {
        boolean netice = false;

        if (eded % 2 == 0) {
            netice = true;
        }
        return netice;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // yaz();

       /* System.out.println("adi daxil edin");
        String a = sc.nextLine();
        yazdir(a);*/


    /*  int netice =  topla();
        System.out.println(netice);*/

       /* System.out.println("a-ni daxil edin");
        int a = sc.nextInt();
        System.out.println("b-ni daxil edin");
        int b = sc.nextInt();

        int result = vurma(a,b);
        System.out.println(result);*/

        String result = musMen(45);
        System.out.println(result);

        System.out.println("a-ni daxil edin");
        int a = sc.nextInt();
        boolean netice = cutdurmu(a);

        System.out.println(netice);
    }

}
