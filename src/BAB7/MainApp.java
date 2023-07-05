package BAB7;

import java.util.Scanner;

import BAB7.interfaces.Phone;

public class MainApp {
    public static void main(String[] args) {
        Phone redmiNote10 = new Xiaomi();
        
        PhoneUser farhan = new PhoneUser(redmiNote10);

        //menyalakan hp telebih dahulu
        farhan.turnOffThePhone();

        //Membuat tampilan
        Scanner input = new Scanner(System.in);
        String aksi;
        boolean isLooping = true;
        
        do {
            System.out.println("====Aplikasi Intefrace====");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Perkecil Volume");
            System.out.println("[0] Keluar");
            System.out.println("=========================");

            System.out.print("Pilih Aksi: ");
            aksi = input.next();

            if (aksi.equalsIgnoreCase("1")) {
                farhan.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")) {
                farhan.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")) {
                farhan.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")) {
                farhan.makePhoneSilence();
            } else if (aksi.equalsIgnoreCase("0")) {
                isLooping = false;
            } else {
                System.out.println("Aksi tidak tersedia");
                System.out.println("Silahkan pilih aksi yang tersedia");
            }
        } while(isLooping);


    }
}
