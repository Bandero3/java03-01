package dayone;

import java.util.List;

public class Question {
    private String question;
    private List<String> answers;
    private String answer;

    public Question(String question, List<String> answers, String answer) {
        this.question = question;
        this.answers = answers;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public String getAnswer() {
        return answer;
    }
}
