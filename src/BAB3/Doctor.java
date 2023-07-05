package BAB3;

public class Doctor extends Person {
    String specialist;

    public Doctor(String name, String address, String specialist){
        super(name, address);
        this.specialist = specialist;
    }

    public Doctor() {
        super();
    }

    void surgery() {
        System.out.println("I can surgery an operation patiens");
    }

    void greeting() {
        super.greeting();
        System.out.println("My occupation is a " + specialist + " doctor.");
    }
    
}
