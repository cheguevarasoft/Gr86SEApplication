package dependencyinjection.test2;

public class CarMain {

    public static void main(String[] args) {

        Car mashin1 = new Car(new DieselEngine());
        mashin1.drive();

        Car mashin2 = new Car(new HybrydEngine());
        mashin2.drive();

        Car mashin3 = new Car(new ElectricEngine());
        mashin3.drive();

    }

}
