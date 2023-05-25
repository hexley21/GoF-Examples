import signals.AnalogSignal;
import signals.DigitSignal;
import signals.types.BinaryDigitSignal;
import signals.types.FloatAnalogSignal;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        final float[] analogData = { 0.2f, 1.4f, 3.12f, 0.9f };
        final byte[] binData = { 0, 1, 1, 0 };

        // Create an instance of FloatAnalogSignal and print the analog signal
        AnalogSignal analogSignal = new FloatAnalogSignal(analogData);
        analogSignal.printAnalog();

        // Create an instance of BinaryDigitSignal and print the digit signal
        DigitSignal digitSignal = new BinaryDigitSignal(binData);
        digitSignal.printDigit();

        // Create an instance of AnalogToDigitAdapter and print the adapted digit signal
        AnalogToDigitAdapter adAdapter = new AnalogToDigitAdapter(analogSignal, 1.0f);
        System.out.println(Arrays.toString(adAdapter.getDigit()));
    }
}
