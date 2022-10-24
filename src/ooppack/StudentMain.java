package ooppack;

public class StudentMain {

    public static void main(String[] args) {
        Student telebe = new Student();

        Student.bashVarmi = true;

        telebe.setName("haMIL");
        telebe.setSurname("YUsublu");
        telebe.setAvg(-75);
        telebe.setActive(true);


        System.out.println(telebe.getName());
        System.out.println(telebe.getSurname());
        System.out.println(telebe.getAvg());
        System.out.println(telebe.isActive());

        // telebe.printData();


    }

}
