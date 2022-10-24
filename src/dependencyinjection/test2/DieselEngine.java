package dependencyinjection.test2;

public class DieselEngine implements Engine {
    @Override
    public String start() {
        return "DieselEngine started ";
    }
}
