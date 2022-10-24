package ooppack;

public class Student {

    private String name;
    private String surname;
    private int Avg;
    private boolean isActive;

    static boolean bashVarmi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname.toUpperCase();
    }

    public int getAvg() {
        return Avg;
    }

    public void setAvg(int avg) {
        Avg = Math.abs(avg);
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    void printData() {

        if (this.isActive) {
            System.out.println("adi : " + this.name + " soyadi : " + this.surname + " ortalama : " + this.Avg + " status : " + this.isActive);
        }

    }

}
