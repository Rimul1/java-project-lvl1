package hexlet.code;

public class QuestionAnswer {
    private final String answer;
    private final String question;

    public QuestionAnswer(String question, String answer) {
        this.answer = answer;
        this.question = question;
    }


    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }
}
