package BAB2;


public class AppmainSuperConstructor {
    public static void main(String[] args) {
     
        // object dengan constructor default
        Doctor doctor1 = new Doctor();
        doctor1.name = "Senia";
        doctor1.address = "Bogor";
        doctor1.specialist = "Dentis";

        // object dengan constructor berparameter
        Doctor doctor2 = new Doctor("Bagus", "Bandung", "Cardiologist");

        doctor1.greeting();
        System.out.println();
        doctor2.greeting();

    }
}
