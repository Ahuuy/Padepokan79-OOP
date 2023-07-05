package BAB1;
public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // Constructor default
    Person() {

    }

    // constructor dengan satu parameter
    Person(String paramName) {
        name = paramName;
    }

    // constructor dengan parameter 
    Person(String name, String address) {
        // this name dan addres menunjukan field name dan address dari class person itu sendiri
        // gunakan keyword this untuk mengatasi variable shadowing
        this.name = name;
        this.address = address;
    }

    // method void
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name + ".");
    }

    // method return value (mengembalikan nilaii)
    String sayAddress() {
        return "I, Come form " + address + ".";
    }
}
