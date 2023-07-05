package BAB5.main;
import BAB5.parent.Person;
import BAB5.childs.Doctor;
import BAB5.childs.Teacher;
import BAB5.childs.Programmer;



public class AppMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Agungg");
        person1.setAddress("Garut");

        System.out.println(person1.getName());
        System.out.println(person1.getAddress());
    }

    static void  sayHello(Person person) {
        
    }

}
