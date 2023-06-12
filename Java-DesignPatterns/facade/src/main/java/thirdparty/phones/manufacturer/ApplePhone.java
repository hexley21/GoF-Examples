package thirdparty.phones.manufacturer;

import thirdparty.phones.Phone;

/**
 * Represents an Apple phone.
 */
public class ApplePhone extends Phone {

    private final int iosVersion;

    /**
     * Constructs a new Apple phone with the specified name and iOS version.
     *
     * @param name        the name of the Apple phone
     * @param iosVersion  the iOS version of the Apple phone
     */
    public ApplePhone(String name, int iosVersion) {
        super(name);
        this.iosVersion = iosVersion;
    }

    /**
     * Returns the iOS version of the Apple phone.
     *
     * @return the iOS version of the Apple phone
     */
    public int getIosVersion() {
        return iosVersion;
    }
}