package signals.types;

import signals.AnalogSignal;

import java.util.Arrays;

/**
 * This class represents an implementation of the AnalogSignal interface using float data.
 */
public class FloatAnalogSignal implements AnalogSignal {
    private float[] data;

    /**
     * Constructs a FloatAnalogSignal object with the provided data.
     *
     * @param data The analog data as an array of floats.
     */
    public FloatAnalogSignal(float[] data) {
        this.data = data;
    }

    /**
     * Gets the analog data.
     *
     * @return The analog data as an array of floats.
     */
    @Override
    public float[] getAnalog() {
        return data;
    }

    /**
     * Sets the analog data.
     *
     * @param analogData The analog data to be set, provided as an array of floats.
     */
    @Override
    public void setAnalog(float[] analogData) {
        this.data = analogData;
    }

    /**
     * Prints the analog signal.
     */
    @Override
    public void printAnalog() {
        System.out.println(Arrays.toString(data));
    }
}

