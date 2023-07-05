package BAB1;

public class MainApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Farhan";
        person1.address = "Garut";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Padepokan 79");
        System.out.println(person1.sayAddress());

    }
}
