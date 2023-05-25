package signals;

/**
 * This interface represents a digit signal.
 */
public interface DigitSignal {
    /**
     * Gets the digit data.
     *
     * @return The digit data as an array of bytes.
     */
    byte[] getDigit();

    /**
     * Sets the digit data.
     *
     * @param digitData The digit data to be set, provided as an array of bytes.
     */
    void setDigit(byte[] digitData);

    /**
     * Prints the digit signal.
     */
    void printDigit();
}





