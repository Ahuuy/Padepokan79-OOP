package BAB1;

public class MainAppConstructor {
    public static void main(String[] args) {
        //Membuat object dari class person menggunakan constructor parameter
        Person person1 = new Person("Farhan", "Garut");
        person1.sayHello("Padepokan 79");
        System.out.println(person1.sayAddress());

        //Membuat object dari class person menggunakan constructor default
        Person person2 = new Person();
        person2.name = "Ujang";
        person2.address = "Leles";
        person2.sayHello("Padepokan 79");
        System.out.println(person2.sayAddress());

        //Membuat object dari class person menggunakan constructor satu parameter
        Person person3 = new Person("Sukirman");
        person3.address = "Yogyakarta";
        person3.sayHello("Padepokan 79");
        System.out.println(person3.sayAddress());
    }   
}
