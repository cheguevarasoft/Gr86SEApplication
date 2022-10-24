package enumpack;

public class Homemain {


    public static void main(String[] args) {

        final int a = 45;

        String evnovu = String.valueOf(HomeType.Bina);

        System.out.println(evnovu);

        String cardtype1 = String.valueOf(CardType.Classic);
        System.out.println(cardtype1);

        int cardtype = CardType.Classic.getValue();
        System.out.println(cardtype);
    }
}
