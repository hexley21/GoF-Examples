package thirdparty.phones;

/**
 * Represents a phone.
 */
public abstract class Phone {

    private final String name;

    /**
     * Constructs a new phone with the specified name.
     *
     * @param name the name of the phone
     */
    public Phone(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the phone.
     *
     * @return the name of the phone
     */
    public String getName() {
        return name;
    }
}
