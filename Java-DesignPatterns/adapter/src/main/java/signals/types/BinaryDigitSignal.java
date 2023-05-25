package signals.types;

import signals.DigitSignal;

import java.util.Arrays;

/**
 * This class represents an implementation of the DigitSignal interface using binary digit data.
 */
public class BinaryDigitSignal implements DigitSignal {
    private byte[] data;

    /**
     * Constructs a BinaryDigitSignal object with the provided data.
     *
     * @param data The digit data as an array of bytes.
     */
    public BinaryDigitSignal(byte[] data) {
        this.data = data;
    }

    /**
     * Gets the digit data.
     *
     * @return The digit data as an array of bytes.
     */
    @Override
    public byte[] getDigit() {
        return data;
    }

    /**
     * Sets the digit data.
     *
     * @param digitData The digit data to be set, provided as an array of bytes.
     */
    @Override
    public void setDigit(byte[] digitData) {
        this.data = digitData;
    }

    /**
     * Prints the digit signal.
     */
    @Override
    public void printDigit() {
        System.out.println(Arrays.toString(data));
    }
}

