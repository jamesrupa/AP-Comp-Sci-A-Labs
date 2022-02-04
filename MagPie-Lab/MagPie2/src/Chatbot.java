public class Chatbot {

    public String getGreeting() {
        return "Hello, let's talk.";
    }

    public String getResponse(String statement) {
        String blank = statement.trim();
        String response = "";
        if (blank.isEmpty()) {
            response = "Say something, please.";
        } else if (statement.indexOf("no") >= 0) {
            response = "Why so negative?";
        } else if (statement.indexOf("mother") >= 0 || statement.indexOf("father") >= 0) {
            response = "Tell me more about your family.";
        } else if (statement.indexOf("hi") >= 0 || (statement.indexOf("hello")) >= 0) {
            response = "Well hi there.";
        } else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0){
            response = "Tell me more about your pets.";
        } else if (statement.indexOf("Mr.") >= 0) {
            response = "He sounds like a good teacher.";
        } else if (statement.indexOf("brother") >= 0 || statement.indexOf("sister") >= 0) {
            response = "Is that right. Tell me more about your siblings";
        }
        else {
            response = getRandomResponse();
        }
        return response;
    }

    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        } else if (whichResponse == 1) {
            response = "Hmmm.";
        } else if (whichResponse == 2) {
            response = "Do you really think so?";
        } else if (whichResponse == 3) {
            response = "You don't say.";
        } else if (whichResponse == 4) {
            response = "That's pretty cool.";
        } else if (whichResponse == 5) {
            response = "Tell me more...";
        }

        return response;
    }
}
