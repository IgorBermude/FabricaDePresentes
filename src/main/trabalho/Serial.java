package trabalho;

public class Serial {

    private static int numSerial = 1;

    public static int getSerial() {
        return numSerial++;
    }
}
