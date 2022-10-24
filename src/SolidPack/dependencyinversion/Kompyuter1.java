package SolidPack.dependencyinversion;

public class Kompyuter1 {

    private Monitor monitor;
    private Klaviatura klaviatura;

    public Kompyuter1(Monitor monitor, Klaviatura klaviatura) {

        this.monitor = monitor;
        this.klaviatura = klaviatura;
    }
}
