package thirdparty;

import thirdparty.phones.Phone;

/**
 * Represents a delivery service provided by FedEx.
 */
public class FedEx {

    private final Phone phone;

    /**
     * Constructs a new FedEx delivery service with the specified phone.
     *
     * @param phone the phone to be delivered
     */
    public FedEx(Phone phone) {
        this.phone = phone;
    }

    /**
     * Delivers the phone to the specified address.
     *
     * @param address the delivery address
     * @return the delivered phone
     */
    public Phone deliverPhone(String address) {
        System.out.printf("%s was delivered to %s\n", phone.getName(), address);
        return phone;
    }
}