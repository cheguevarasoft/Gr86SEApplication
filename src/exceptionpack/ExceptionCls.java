package exceptionpack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCls {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ededi daxil edin");

        try {
            int a = sc.nextInt();
            System.out.println(a);

            int[] ededler = new int[2];
            ededler[0] = 45;
            ededler[1] = 74;
            ededler[2] = 27;

            System.out.println(ededler[0]);

        } catch (InputMismatchException ex) {

            System.out.println(ex);

        } catch (ArrayIndexOutOfBoundsException ex) {

            System.out.println(ex);
            return;
        } finally {
            System.out.println("Hamilio");
        }


        System.out.println("Afqan Cafarov");
    }
}
