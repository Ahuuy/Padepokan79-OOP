package BAB7;

import BAB7.interfaces.Phone;

public class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone menyala......");
        System.out.println("Selamat datang di Xiaomi");
        System.out.println("Android version 10");
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
            System.out.println("Handhpne mati silahkan hidupkan terlebih dahulu");
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
            System.out.println("Handhpne mati silahkan hidupkan terlebih dahulu");
        }
    }

    // Getter dan setter
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPoweron(boolean isPowerOn) {
        this.isPowerOn = isPowerOn;
    }
}
