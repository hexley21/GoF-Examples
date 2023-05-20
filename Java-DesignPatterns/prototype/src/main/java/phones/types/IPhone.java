package phones.types;

import phones.Phone;
import phones.Prototype;

/**
 * The IPhone class represents an iPhone, which is a specific type of Phone.
 * It extends the Phone class and implements the Prototype interface for cloning functionality.
 */
public class IPhone extends Phone implements Prototype {

    public boolean hasFaceId;

    public IPhone(int version, int serialNumber, boolean isSimLocked, boolean hasFaceId) {
        super("iOS", version, serialNumber, isSimLocked);
        this.hasFaceId = hasFaceId;
    }

    /**
     * Constructs an IPhone object by copying the properties of another IPhone object.
     *
     * @param phone  the IPhone object to be copied
     */
    public IPhone(IPhone phone) {
        super(phone);
        this.hasFaceId = phone.hasFaceId;
    }

    /**
     * Creates and returns a clone of the current IPhone object.
     *
     * @return a clone of the IPhone object
     */
    @Override
    public Prototype clone() {
        return new IPhone(this);
    }

}
