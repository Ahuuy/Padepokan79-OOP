package BAB5.childs;
import BAB5.parent.Person;

public class Programmer extends Person{
    private String technology;

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

    //getter dan setter
    public String getTechnology() {
        return this.technology;
    }

    public void setTechnlogoy(String technology) {
        this.technology = technology;
    }
}
