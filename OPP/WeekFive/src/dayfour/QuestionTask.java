package dayfour;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class QuestionTask {
    private final String tasks = "Kiek bus 2+2?,2,6,4;Kiek bus 3*6?,15,2,18;Kiek bus 8*8?,88,66,64;Kiek bus 4*4?,4,14,16;Kiek bus 11*11?,111,101,121;" +
            "Kiek bus 6*9?,59,69,54;Kiek bus 3*3?,6,33,9;Kiek bus 33*33?,999,199,1089;Kiek bus 5*8?,80,50,40;Kiek bus 10*11?,100,111,110;" +
            "Kiek bus 3*8?,16,25,24;Kiek bus 9*9?,99,101,81;Kiek bus 25*4?,75,105,100;Kiek bus 25*25?,500,525,625;Kiek bus 10*10?,110,111,100";

    private final Map<Integer, Question> qAndA = new HashMap<>();
    private int testNumber = 1;
    private int grade = 0;

    public static void main(String[] args) {


        QuestionTask task = new QuestionTask();
        task.fillQuestionToMap();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        do {
            task.showQuestion(random, scanner);
        } while (task.testNumber != 11);

        System.out.printf("Jusu atsakete %d/10 klausymu - %s", task.grade, task.comment(task.grade));
    }


    private void showQuestion(Random random, Scanner scanner) {
        int number = (random.nextInt(15)) + 1;
        Question klausymas = qAndA.get(number);
        int correctAnswer = klausymas.getCorrectAnswer();

        System.out.printf("%d. Klausymas - %s | a:%d b:%d c:%d\n", testNumber++, klausymas.getQuestion(), klausymas.getAnswer1(), klausymas.getAnswer2(), correctAnswer);
        answerQuestion(scanner, correctAnswer);
    }

    private void answerQuestion(Scanner scanner, int correctAnswer) {
        int answer = scanner.nextInt();
        if (answer == correctAnswer) {
            grade += 1;
        }
    }

    private void fillQuestionToMap() {
        int questionNumber = 1;
        String[] question = tasks.split(";");
        for (String s : question) {
            String[] splitPairs = s.split(",");
            int answerOne = Integer.parseInt(splitPairs[1]);
            int answerTwo = Integer.parseInt(splitPairs[2]);
            int answerThree = Integer.parseInt(splitPairs[3]);

            qAndA.put(questionNumber++, new Question(splitPairs[0], answerOne, answerTwo, answerThree));

        }
    }

    private String comment(int result) {
        if (result < 5) {
            return "Blogai";
        } else if (result > 5 && result < 8) {
            return "Vidutiniskai";
        } else if (result > 7 && result < 10) {
            return "Labai gerai";
        } else {
            return "Genijus";
        }
    }
}
