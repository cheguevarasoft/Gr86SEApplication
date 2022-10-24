package ooppack;

public class Methods2 {

    static int vurma(int a, int b) {
        int netice = a * b;
        return netice;
    }

    static int vurma(int a, int b, int c) {
        int netice = a * b * c;
        return netice;
    }

    static int vurma(String a, String b) {
        int netice = Integer.valueOf(a) * Integer.valueOf(b);
        return netice;
    }


    public static void main(String[] args) {


        System.out.println(vurma(25, 4));
        System.out.println(vurma("74", "2"));
        System.out.println(vurma(42, 4, 7));
    }
}
