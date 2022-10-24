package dependencyinjection.test2;

public class Car {

    Engine engine;

    public Car(Engine en) {

        this.engine = en;
    }

    public void drive() {
        String engineStart = engine.start();
        System.out.println(engineStart);
    }

}
