package SolidPack.dependencyinversion;

public class Kompyuter {

    private Monitor monitor;
    private StandartKlaviatura standartKlaviatura;

    public Kompyuter() {

        monitor = new Monitor();
        standartKlaviatura = new StandartKlaviatura();
    }
}
