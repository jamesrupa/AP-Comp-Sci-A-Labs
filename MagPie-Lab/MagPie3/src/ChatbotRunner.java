import java.util.Scanner;

public class ChatbotRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Chatbot steve = new Chatbot();

        System.out.println (steve.getGreeting());
        String statement = scan.nextLine();

        while (!statement.equals("Bye")) {
            System.out.println (steve.getResponse(statement));
            statement = scan.nextLine();
        }
    }
}