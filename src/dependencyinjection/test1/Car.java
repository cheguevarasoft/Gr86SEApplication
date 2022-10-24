package dependencyinjection.test1;

public class Car {

    DieselEngine engine;


    public Car() {
        this.engine = new DieselEngine();


    }

    public void drive() {
        String engineStart = engine.start();
        System.out.println(engineStart);


    }


}
