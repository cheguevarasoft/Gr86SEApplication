package dependencyinjection.test2;

public class ElectricEngine implements Engine {
    @Override
    public String start() {
        return "ElectricEngine started ";
    }
}
