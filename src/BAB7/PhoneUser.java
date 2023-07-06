package BAB7;

import BAB7.interfaces.Phone;

public class PhoneUser {
    private Phone phone;

    public PhoneUser() {
    }

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void powerOn() {
        if (phone != null) {
            phone.powerOn();
        } else {
            System.out.println("Belum ada handphone yang dipilih.");
        }
    }

    public void powerOff() {
        if (phone != null) {
            phone.powerOff();
        } else {
            System.out.println("Belum ada handphone yang dipilih.");
        }
    }

    public void volumeUp() {
        if (phone != null) {
            phone.volumeUp();
        } else {
            System.out.println("Belum ada handphone yang dipilih.");
        }
    }

    public void volumeDown() {
        if (phone != null) {
            phone.volumeDown();
        } else {
            System.out.println("Belum ada handphone yang dipilih.");
        }
    }
}
