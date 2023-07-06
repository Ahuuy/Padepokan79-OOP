package BAB7;

import BAB7.interfaces.Phone;

public class Samsung implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Samsung() {
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        if (isPowerOn) {
            System.out.println("Handphone sudah menyala.");
        } else {
            isPowerOn = true;
            System.out.println("Handphone menyala......");
            System.out.println("Selamat datang di Samsung");
            System.out.println("Versi android 11");
        }
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Mematikan Handphone");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume sudah Maksimal!!");
            } else {
                this.volume += 10;
                System.out.println("Volume Sekarang " + this.volume + "%");
            }
        } else {
            System.out.println("Handphone mati, silahkan hidupkan terlebih dahulu");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume = " + this.volume + "%");
            } else {
                this.volume -= 10;
                System.out.println("Volume Sekarang " + this.volume + "%");
            }
        } else {
            System.out.println("Handphone mati, silahkan hidupkan terlebih dahulu");
        }
    }
}
