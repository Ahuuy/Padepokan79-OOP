package BAB2;

public class Appmain {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Farhan";
        person1.address = "Garut";

        Teacher teacher1 = new Teacher();
        teacher1.name = "Bagas";
        teacher1.address = "Bandung";
        teacher1.subject = "Bahasa Inggris";

        Doctor doctor1 = new Doctor();
        doctor1.name = "Senia";
        doctor1.address = "Bogor";
        doctor1.specialist = "Dentis";

        Programmer programmer1 = new Programmer();
        programmer1.name = "Dea";
        programmer1.address = "Bandung";
        programmer1.technology = "Python";

        person1.greeting();
        System.out.println();

        teacher1.greeting();
        System.out.println();

        doctor1.greeting();
        System.out.println();

        programmer1.greeting();
        System.out.println();
    }
}
