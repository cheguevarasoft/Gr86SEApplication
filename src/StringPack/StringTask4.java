package StringPack;

import java.util.Arrays;
import java.util.Scanner;

public class StringTask4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("cumle daxil edin");
        String metn = sc.nextLine();

        // men kursa gedirem   // gedirem[0], kursa[1], men[2]
        String[] massiv = metn.split(" ");

        Arrays.sort(massiv);

        for (String soz : massiv) {

            System.out.println(soz);
        }


    }
}
