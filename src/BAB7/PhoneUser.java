package BAB7;

import BAB7.interfaces.Phone;

public class PhoneUser {
    private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    public void turnOnThePhone() {
        this.phone.powerOn();
    }

    public void turnOffThePhone() {
        this.phone.powerOff();
    }

    public void makePhoneLouder() {
        this.phone.volumeUp();
    }

    public void makePhoneSilence() {
        this.phone.volumeDown();
    }

    //getter dan setter
    public Phone getPhone() {
        return this.phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
