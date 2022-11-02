package guru.qa;

public class Phone {

    String phoneName;
    boolean isAndroidPhone;
    int phonePrice;
    String[] supportedOsVersions;

    //    Конструкторы с разными параметрами
    public Phone(String phoneName, boolean isAndroidPhone, int phonePrice) {
        this.phoneName = phoneName;
        this.isAndroidPhone = isAndroidPhone;
        this.phonePrice = phonePrice;
    }

    public Phone(String phoneName, boolean isAndroidPhone) {
        this.phoneName = phoneName;
        this.isAndroidPhone = isAndroidPhone;
    }

    public Phone() {
    }

    //    Сеттеры
    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void setAndroidPhone(boolean androidPhone) {
        isAndroidPhone = androidPhone;
    }

    public void setPhonePrice(int phonePrice) {
        this.phonePrice = phonePrice;
    }

    public void setSupportedOsVersions(String[] supportedOsVersions) {
        this.supportedOsVersions = supportedOsVersions;
    }

    //    Геттеры
    public String getPhoneName() {
        return phoneName;
    }

    public boolean isAndroidPhone() {
        return isAndroidPhone;
    }

    public int getPhonePrice() {
        return phonePrice;
    }
}
