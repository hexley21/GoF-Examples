import thirdparty.FedEx;
import thirdparty.phones.manufacturer.ApplePhone;
import thirdparty.phones.manufacturer.GooglePhone;

/**
 * Represents a facade for buying phones.
 */
public class BuyPhoneFacade {

    /**
     * Gets an Apple phone and delivers it to the specified address.
     *
     * @param address     the delivery address
     * @param phoneName   the name of the Apple phone
     * @param iosVersion  the iOS version of the Apple phone
     * @return the delivered Apple phone
     */
    public ApplePhone getApple(String address, String phoneName, int iosVersion) {
        FedEx delivery = new FedEx(new ApplePhone(phoneName, iosVersion));
        return (ApplePhone) delivery.deliverPhone(address);
    }

    /**
     * Gets a Google phone and delivers it to the specified address.
     *
     * @param address         the delivery address
     * @param phoneName       the name of the Google phone
     * @param androidVersion  the Android version of the Google phone
     * @return the delivered Google phone
     */
    public GooglePhone getGoogle(String address, String phoneName, int androidVersion) {
        FedEx delivery = new FedEx(new GooglePhone(phoneName, androidVersion));
        return (GooglePhone) delivery.deliverPhone(address);
    }
}