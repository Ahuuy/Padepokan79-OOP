package BAB4.childs;
import BAB4.parent.Person;

public class Teacher extends Person {
    public String subject;

    public Teacher(String name, String address, String subject) {
        super(name, address);
        this.subject = subject;
    }

    public Teacher() {
        super();
    }

    public void teaching() {
        System.out.println("I can teach " + subject + ", so anyone wants to learn can talk to me");
    }

    public void greeting() {
        super.greeting();
        System.out.println("My job is a " + subject + " teacher.");
    }
}
