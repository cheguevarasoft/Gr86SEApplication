package ooppack;

public class Audi extends Car {

    String aPackage;

    @Override
    void start() {
        System.out.println("Audi Starting");
    }

    @Override
    void stop() {
        System.out.println("Audi Stoping");
    }
}
