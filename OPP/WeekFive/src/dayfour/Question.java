package dayfour;

public class Question {
    private final String question;
    private final int answer1;
    private final int answer2;
    private final int correctAnswer;

    public Question(String question, int answer1, int answer2, int correctAnswer) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.correctAnswer = correctAnswer;
    }
    public String getQuestion() {
        return question;
    }

    public int getAnswer1() {
        return answer1;
    }

    public int getAnswer2() {
        return answer2;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
