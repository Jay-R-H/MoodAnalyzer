package MoodAnalyzer;

public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.toLowerCase().equals("sad")) {
            return "SAD";
        } else
            return "HAPPY";
    }
}

