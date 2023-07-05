package BAB4.childs;
import BAB4.parent.Person;

public class Doctor extends Person {
    public String specialist;

    public Doctor(String name, String address, String specialist){
        super(name, address);
        this.specialist = specialist;
    }

    public Doctor() {
        super();
    }

    public void surgery() {
        System.out.println("I can surgery an operation patiens");
    }

    public void greeting() {
        super.greeting();
        System.out.println("My occupation is a " + specialist + " doctor.");
    }
    
}
