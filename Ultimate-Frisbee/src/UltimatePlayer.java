public class UltimatePlayer extends Person {

    // VARIABLES
    private int jerseyNumber = 0;
    private static int num = 0;
    private String p;

    public UltimatePlayer(String firstName,String lastName, String position) {
        super(firstName,lastName);
        if (position == "handler" || position == "cutter") {
            p = position;
        } else {
            p = "handler";
        }
        num++;
        jerseyNumber = num;
    }

    public String getPosition() {
        return p;
    }

    public String toString() {
        return super.toString() + "\n   Jersey #: " + jerseyNumber + "\n   Position: " + p;
    }
}
