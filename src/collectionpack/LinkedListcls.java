package collectionpack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListcls {

    public static void main(String[] args) {

        List<String> sheherler = new LinkedList<>();
        sheherler.add("Baku");
        sheherler.add("Ganja");
        sheherler.add("Zaqatala");


        for (String item : sheherler) {
            System.out.println(item);
        }


    }

}
