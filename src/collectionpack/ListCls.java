package collectionpack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListCls {

    public static void main(String[] args) {


        List<Integer> list = new LinkedList<>();
        list.add(16);
        list.add(3);
        list.add(2);
        list.add(4);

        int a = list.get(1);

        System.out.println(a);

        //wrapper

        Iterator<Integer> iterator = list.iterator();

        /*next() :
        previous():
        hasNext():
        hasPrevious():*/

        while(iterator.hasNext()){

            System.out.println(iterator.next());
        }

        int r = 50;
        Object y = r;//boxing

        Object o = 45;
        int b = (int)o;//unboxing

    }
}
