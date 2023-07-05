package BAB4.childs;
import BAB4.parent.Person;

public class Programmer extends Person{
    public String technology;

    public Programmer (String name, String address, String technology) {
        super(name, address);
        this.technology = technology;
    }

    public Programmer () {
        super();
    }

    public void hacking() {
        System.out.println("I can hack a webstie");
    }

    public void coding() {
        System.out.println("I can create an application using technology : " + technology + ".");
    }

    public void greeting() {
        super.greeting();
        System.out.println("My job is a " + technology + " programmer.");
    }
}
