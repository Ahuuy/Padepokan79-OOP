package BAB5.childs;
import BAB5.parent.Person;

public class Teacher extends Person {
    private String subject;

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

    //getter dan setter
    public String getSubject () {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
