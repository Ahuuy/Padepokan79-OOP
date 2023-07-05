package BAB2;

public class Programmer extends Person{
    String technology;

    public Programmer (String name, String address, String technology) {
        super(name, address);
        this.technology = technology;
    }

    public Programmer () {
        super();
    }

    void hacking() {
        System.out.println("I can hack a webstie");
    }

    void coding() {
        System.out.println("I can create an application using technology : " + technology + ".");
    }

    void greeting() {
        super.greeting();
        System.out.println("My job is a " + technology + " programmer.");
    }
}
