package BAB3;

public class Teacher extends Person {
    String subject;

    public Teacher(String name, String address, String subject) {
        super(name, address);
        this.subject = subject;
    }

    public Teacher() {
        super();
    }

    void teaching() {
        System.out.println("I can teach " + subject + ", so anyone wants to learn can talk to me");
    }

    void greeting() {
        super.greeting();
        System.out.println("My job is a " + subject + " teacher.");
    }
}
