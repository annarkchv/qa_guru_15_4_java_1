package guru.qa;

public class PhoneExample {

    public static void main(String[] args) {
        Phone samsung = new Phone("Samsung", true, 800);
        // System.out.println(samsung.getPhoneName());
        samsung.setSupportedOsVersions(new String[]{"11", "12", "13"});
        // System.out.println("Samsung supported OS count: " + samsung.supportedOsVersions.length);

        Phone iPhone = new Phone("IPhone", false);
        iPhone.setPhonePrice(1000);
        // System.out.println(iPhone.getPhonePrice());
        iPhone.setSupportedOsVersions(new String[]{"15", "16"});
        // System.out.println("IPhone supported OS count: " + iPhone.supportedOsVersions.length);

        Phone sony = new Phone();
        sony.setPhoneName("Sony");
        sony.setAndroidPhone(true);
        sony.setPhonePrice(700);
        // System.out.println(sony.phoneName);
        // System.out.println(sony.isAndroidPhone);
        // System.out.println(sony.phonePrice);

        //  Цикл for i
        for (int i = 0; i < iPhone.supportedOsVersions.length; i++) {
            System.out.println("IPhone OS version: " + iPhone.supportedOsVersions[i]);
        }

        // Цикл for each
        for (String osVersion : samsung.supportedOsVersions) {
            System.out.println("Samsung OS version: " + osVersion);
        }

        // Цикл while (для обхода массива обычно не используется)
        int arrIndex = 0;
        while (arrIndex < iPhone.supportedOsVersions.length) {
            System.out.println("IPhone OS version: " + iPhone.supportedOsVersions[arrIndex]);
            arrIndex++;
        }

        // Цикл do while (для обхода массива обычно не используется)
        do {
            System.out.println("Hello, world!");
        } while (false);
    }
}
