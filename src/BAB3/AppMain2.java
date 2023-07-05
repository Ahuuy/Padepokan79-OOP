package BAB3;


public class AppMain2 {
    public static void main(String[] args) {
        Person person1 = new Programmer("Farhan", "Garut", ".NetCore");
        Person person2 = new Teacher("Julianti", "Garut", "Bahasa Inggris");
        Person person3 = new Doctor("Juliansyah", "Garut", "Mata");

        sayHello(person1);
        sayHello(person2);
        sayHello(person3);
    }

    static void  sayHello(Person person) {
        String message;
        if (person instanceof Programmer) {
            Programmer programmer = (Programmer) person;
            message = "Hello, " + programmer.name + ". Seorang programmer " + programmer.technology + ".";
        } else if (person instanceof Teacher) {
            Teacher teacher = (Teacher)person;
            message = "Hello, " + teacher.name + ". Seorang Guru " + teacher.subject + ".";
        } else if (person instanceof Doctor) {
            Doctor doctor = (Doctor)person;
            message = "Hello, " + doctor.name + ". Seorang Doktor " + doctor.specialist + ".";
        } else {
            message = "Hello, " + person.name;
        }

        System.out.println(message);
    }

}
