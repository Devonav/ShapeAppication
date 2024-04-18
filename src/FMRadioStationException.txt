/**
 * FMRadioStationException class represents the custom exception for the FMRadioStation class.
 * This exception is thrown when a radio station's call sign or frequency is invalid.
 */
public class FMRadioStationException extends Exception {

    private String callSign;
    private float frequency;

    /**
     * Constructor for FMRadioStationException class.
     * @param callSign The call sign of the radio station causing the exception.
     * @param frequency The frequency of the radio station causing the exception.
     */
    public FMRadioStationException(String callSign, float frequency) {
        super("Invalid FM radio station with call sign: " + callSign + " and frequency: " + frequency + " MHz");
        this.callSign = callSign;
        this.frequency = frequency;
    }

    public String getCallSign() {
        return callSign;
    }

    public float getFrequency() {
        return frequency;
    }
}
