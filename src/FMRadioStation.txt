/**
 * The FMRadioStation class represents an FM radio station.
 * The class validates the station's call sign and frequency during construction.
 */
public class FMRadioStation {

    private String callSign;
    private float frequency;

    /**
     * Constructor for the FMRadioStation class.
     *
     * @param callSign The call sign of the radio station.
     * @param frequency The frequency of the radio station.
     * @throws FMRadioStationException If the call sign or frequency is invalid.
     */
    public FMRadioStation(String callSign, float frequency) throws FMRadioStationException {
        // Validate the call sign
        if (!callSign.matches("[AKNW][A-Z]{3}") || callSign.length() != 4) {
            throw new FMRadioStationException(callSign, frequency);
        }

        // Validate the frequency
        if (frequency < 88.0f || frequency > 108.0f) {
            throw new FMRadioStationException(callSign, frequency);
        }

        // If validation passes, set the fields
        this.callSign = callSign;
        this.frequency = frequency;
    }

    public String getCallSign() {
        return callSign;
    }

    public float getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "FMRadioStation [CallSign=" + callSign + ", Frequency=" + frequency + " MHz]";
    }
}
