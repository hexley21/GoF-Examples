package signals;

/**
 * This interface represents an analog signal.
 */
public interface AnalogSignal {
    /**
     * Gets the analog data.
     *
     * @return The analog data as an array of floats.
     */
    float[] getAnalog();

    /**
     * Sets the analog data.
     *
     * @param analogData The analog data to be set, provided as an array of floats.
     */
    void setAnalog(float[] analogData);

    /**
     * Prints the analog signal.
     */
    void printAnalog();
}