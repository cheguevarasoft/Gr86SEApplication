package ooppack;

public class CarMain {

    public static void main(String[] args) {

        Car.test = 45;
        Car aa = new Audi();
        //  aa.start();
        // aa.stop();


        Car tt = new Toyota();
        // tt.start();
        // tt.stop();


        testCar(aa);


    }

    static void testCar(Car data) {

        System.out.println("Car Testing");
    }


}
