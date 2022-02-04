public class Coach extends Person {

    private String job;

    public Coach(String firstName, String lastName, String role) {
        super(firstName, lastName);
        job = role;
    }

    public String toString(){
        return super.toString() + "\n   Role: " + job;
    }
}
