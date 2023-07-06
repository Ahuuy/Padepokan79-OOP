package BAB7;

import java.util.Scanner;
import BAB7.interfaces.Phone;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Phone phone = null;
        PhoneUser farhan = new PhoneUser();
        boolean isValidOption = true;

        do {
            System.out.println("====Pilih Handphone====");
            System.out.println("[1] Xiaomi");
            System.out.println("[2] Samsung");
            System.out.println("[0] Keluar");
            System.out.println("=========================");

            System.out.print("Pilih Handphone: ");
            String selectedPhone = input.next();

            if (selectedPhone.equalsIgnoreCase("1")) {
                phone = new Xiaomi();
                isValidOption = true;
            } else if (selectedPhone.equalsIgnoreCase("2")) {
                phone = new Samsung();
                isValidOption = true;
            } else if (selectedPhone.equalsIgnoreCase("0")) {
               isValidOption = false;
               break;
            } else {
                System.out.println("Pilihan handphone tidak valid");
            }
        } while (!isValidOption);

        PhoneUser user = new PhoneUser(phone);

        if (phone != null) {
            // Menyalakan hp terlebih dahulu
            farhan.setPhone(phone);
            farhan.powerOn();

            // Membuat tampilan
            String action;
            boolean isLooping = true;

            do {
                System.out.println("====Aplikasi Interface====");
                System.out.println("[1] Nyalakan HP");
                System.out.println("[2] Matikan HP");
                System.out.println("[3] Perbesar Volume");
                System.out.println("[4] Perkecil Volume");
                System.out.println("[0] Keluar");
                System.out.println("=========================");

                System.out.print("Pilih Aksi: ");
                action = input.next();

                if (action.equalsIgnoreCase("1")) {
                    farhan.powerOn();
                } else if (action.equalsIgnoreCase("2")) {
                    farhan.powerOff(); // Matikan handphone
                } else if (action.equalsIgnoreCase("3")) {
                    farhan.volumeUp();
                } else if (action.equalsIgnoreCase("4")) {
                    farhan.volumeDown();
                } else if (action.equalsIgnoreCase("0")) {
                    isLooping = false;
                } else {
                    System.out.println("Aksi tidak tersedia");
                    System.out.println("Silahkan pilih aksi yang tersedia");
                }
            } while (isLooping);
        }

        input.close();
    }
}
