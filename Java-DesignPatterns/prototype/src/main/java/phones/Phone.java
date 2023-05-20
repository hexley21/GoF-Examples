package phones;

/**
 * The Phone class represents a phone and implements the Prototype interface for cloning functionality.
 */
public abstract class Phone implements Prototype {
    public String OS;
    public int version;
    private final int serialNumber;
    private final boolean isSimLocked;

    public Phone(String OS, int version, int serialNumber, boolean isSimLocked) {
        this.OS = OS;
        this.version = version;
        this.serialNumber = serialNumber;
        this.isSimLocked = isSimLocked;
    }

    /**
     * Constructs a Phone object by copying the properties of another Phone object.
     *
     * @param phone  the Phone object to be copied
     */
    public Phone(Phone phone) {
        this.OS = phone.OS;
        this.version = phone.version;
        this.serialNumber = phone.serialNumber;
        this.isSimLocked = phone.isSimLocked;
    }

    /**
     * Creates and returns a clone of the current Phone object.
     *
     * @return a clone of the Phone object
     */
    public abstract Prototype clone();

}
