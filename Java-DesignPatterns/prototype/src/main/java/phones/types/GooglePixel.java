package phones.types;

import phones.Phone;

/**
 * The GooglePixel class represents a Google Pixel phone, which is a specific type of Phone.
 * It extends the Phone class and overrides the clone() method for cloning functionality.
 */

public class GooglePixel extends Phone {

    public String tensorChip;

    public GooglePixel(int version, int serialNumber, boolean isSimLocked, String tensorChip) {
        super("Android", version, serialNumber, isSimLocked);
        this.tensorChip = tensorChip;
    }

    /**
     * Constructs a GooglePixel object by copying the properties of another GooglePixel object.
     *
     * @param phone  the GooglePixel object to be copied
     */
    public GooglePixel(GooglePixel phone) {
        super(phone);
        this.tensorChip = phone.tensorChip;
    }

    /**
     * Creates and returns a clone of the current GooglePixel object.
     *
     * @return a clone of the GooglePixel object
     */
    @Override
    public Phone clone() {
        return new GooglePixel(this);
    }

}
