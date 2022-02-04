import java.util.Scanner;

public class ChatbotRunner {

    public static final String exit = "bye";

    public static void main(String[] args) {
        Chatbot steve = new Chatbot();

        System.out.println (steve.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals(exit)){
            System.out.println (steve.getResponse(statement));
            statement = in.nextLine();
        }
    }

}
