package BAB5.childs;
import BAB5.parent.Person;

public class Doctor extends Person {
    private String specialist;

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
    
    // setter and getter
    public String getSpecialist() {
        return this.specialist;
    }
    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
}
