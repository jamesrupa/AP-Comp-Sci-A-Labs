public class Captain extends UltimatePlayer {

    // VARIABLES
    private String cap;

    public Captain(String firstName, String lastName, String position, boolean type) {
        super(firstName, lastName, position);
        // BOOLEAN
        // True == offense
        // False == defense
        if (type == true)
            cap = "offense";
        else
            cap = "defense";
    }

    public String toString() {
        return super.toString() + "\n   Captain: " + cap;
    }
}
