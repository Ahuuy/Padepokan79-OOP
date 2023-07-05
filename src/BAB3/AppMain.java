package BAB3;

public class AppMain {
    public static void main(String[] args) {
        Person person1 = new Programmer("Farhan", "Garut", ".NetCore");

        person1.greeting();

        System.out.println(((Programmer)person1).technology);
    }
}
