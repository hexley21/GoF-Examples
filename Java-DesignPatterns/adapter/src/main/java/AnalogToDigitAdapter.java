import signals.AnalogSignal;
import signals.DigitSignal;

import java.util.Arrays;

/**
 * This class represents an adapter that converts an AnalogSignal to a DigitSignal.
 */
public class AnalogToDigitAdapter implements DigitSignal {
    private final AnalogSignal analogSignal;
    private byte[] digitData;
    private final float threshold;

    /**
     * Constructs an AnalogToDigitAdapter object with the provided AnalogSignal and threshold.
     *
     * @param analogSignal The AnalogSignal to be adapted.
     * @param threshold    The threshold value used for digitization.
     */
    public AnalogToDigitAdapter(AnalogSignal analogSignal, float threshold) {
        this.analogSignal = analogSignal;
        this.threshold = threshold;
    }

    /**
     * Gets the digit data converted from the analog signal.
     *
     * @return The digit data as an array of bytes.
     */
    @Override
    public byte[] getDigit() {
        float[] analogData = analogSignal.getAnalog();
        int len = analogData.length;

        digitData = new byte[len];
        for (int i = 0; i < len; i++) {
            digitData[i] = floatToByte(analogData[i]);
        }

        return digitData;
    }

    /**
     * Sets the digit data (unsupported operation in the adapter).
     *
     * @param digitData The digit data to be set, provided as an array of bytes.
     * @throws UnsupportedOperationException This operation is not supported by the adapter.
     */
    @Override
    public void setDigit(byte[] digitData) {
        throw new UnsupportedOperationException();
    }

    /**
     * Prints the digit signal.
     */
    @Override
    public void printDigit() {
        System.out.println(Arrays.toString(digitData));
    }

    /**
     * Converts a float value to a byte value based on the threshold.
     *
     * @param f The float value to be converted.
     * @return The corresponding byte value (1 or 0) based on the threshold.
     */
    private byte floatToByte(float f) {
        return (byte) (f >= threshold ? 1 : 0);
    }

}
