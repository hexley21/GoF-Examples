import thirdparty.phones.manufacturer.ApplePhone;
import thirdparty.phones.manufacturer.GooglePhone;

public class Main {
    public static void main(String[] args) {
        BuyPhoneFacade buyPhoneFacade = new BuyPhoneFacade();
        String address = "moon";

        ApplePhone iphone = buyPhoneFacade.getApple(address, "iPhone 14", 15);
        GooglePhone pixel = buyPhoneFacade.getGoogle(address, "pixel 4", 14);

        System.out.println(iphone.getName());
        System.out.println(iphone.getIosVersion());

        System.out.println();

        System.out.println(pixel.getName());
        System.out.println(pixel.getAndroidVersion());
    }
}