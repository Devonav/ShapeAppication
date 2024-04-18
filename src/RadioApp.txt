// Devon Villalona COP3330.CRN12565 9/17/2023
/**
 * The RadioApp class demonstrates the creation of FMRadioStation objects.
 * It validates each creation and prints appropriate messages based on validation results.
 */
public class RadioApp {

    public static void main(String[] args) {
        // Array to hold eight FMRadioStation objects
        FMRadioStation[] radioStations = new FMRadioStation[8];

        // Sample data (some valid, some invalid)
        String[] sampleCallSigns = {"WABC", "KDEF", "NPQR", "WXYZ", "ABCDE", "MXYZ", "NDEF", "WXYZ"};
        float[] sampleFrequencies = {99.5f, 107.5f, 105.0f, 110.0f, 89.5f, 87.5f, 100.0f, 90.0f};

        // Create the radio stations
        for (int i = 0; i < radioStations.length; i++) {
            try {
                radioStations[i] = new FMRadioStation(sampleCallSigns[i], sampleFrequencies[i]);
                System.out.println("Successfully created " + radioStations[i]);
            } catch (FMRadioStationException e) {
                System.out.println("Error creating radio station: " + e.getMessage());
            }
        }

        // Neatly output the call signs and frequencies for each station
        System.out.println("\nList of FMRadioStations:");
        for (FMRadioStation station : radioStations) {
            if (station != null) {
                System.out.println(station);
            }
        }
    }
}

