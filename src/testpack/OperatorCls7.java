package testpack;

import java.util.Scanner;

public class OperatorCls7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Adinizi daxil edin");
        String name = sc.next();
        String soyad = "";

        if (name.equals("Hamil")) {
            soyad = "Yusublu";
        } else if (name.equals("Afqan")) {
            soyad = "Cafarov";
        } else if (name.equals("Fuad")) {
            soyad = "Hasanov";
        } else {

            System.out.println("bele soyad tapilamdi");
        }

        System.out.println(soyad);
    }
}
