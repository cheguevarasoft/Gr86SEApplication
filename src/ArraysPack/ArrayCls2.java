package ArraysPack;

public class ArrayCls2 {

    public static void main(String[] args) {

        String[] names = new String[4];
        names[0] = "Hamil";
        names[1] = "Afqan";
        names[2] = "Fuad";
        names[3] = "Latif";

       /* for(int i = 0;i<names.length;i++){

            System.out.println(names[i]);
        }*/

        for (String ad : names) {

            System.out.println(ad);
        }

    }
}
