package thirdparty.phones.manufacturer;

import thirdparty.phones.Phone;

/**
 * Represents a Google phone.
 */
public class GooglePhone extends Phone {

    private final int androidVersion;

    /**
     * Constructs a new Google phone with the specified name and Android version.
     *
     * @param name           the name of the Google phone
     * @param androidVersion the Android version of the Google phone
     */
    public GooglePhone(String name, int androidVersion) {
        super(name);
        this.androidVersion = androidVersion;
    }

    /**
     * Returns the Android version of the Google phone.
     *
     * @return the Android version of the Google phone
     */
    public int getAndroidVersion() {
        return androidVersion;
    }
}
