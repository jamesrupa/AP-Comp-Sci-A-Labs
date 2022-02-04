public class Person {

    // VARIABLES
    private String fn;
    private String ln;

    public Person(String firstName,String lastName){
        fn = firstName;
        ln = lastName;
    }

    public String toString(){
        return ln + ", " + fn;
    }
}
