package dayone;

import java.util.*;

public class QuestionTaskTeacher {
    private static final String QUESTIONS = "Kiek bus 2+2?,1. 6,2. 7,3. 8,4. 4,4;Kiek bus 3*6?,1. 15,2. 18,3. 5,4. 27,2;Kiek bus 6*7?,1. 42,2. 49,3. 54,4. 48,1;Kiek bus 9*5?,1. 40,2. 35,3. 45,4. 50,3;Kiek bus 7+5?,1. 13,2. 15,3. 12,4. 11,3;Kiek bus 8*8?,1. 42,2. 68,3. 72,4. 64,4;Kiek bus 9*7?,1. 63,2. 58,3. 66,4. 56,1;Kiek bus 4*6?,1. 20,2. 28,3. 24,4. 32,3;Kiek bus 3*13?,1. 39,2. 33,3. 31,4. 37,1;Kiek bus 12*6?,1. 95,2. 78,3. 76,4. 67,2;Kiek bus 69-36?,1. 30,2. 29,3. 41,4. 33,4;Kiek bus 98-62?,1. 36,2. 28,3. 39,4. 32,1;Kiek bus 37+24?,1. 59,2. 61,3. 58,4. 63,2;Kiek bus 31*23?,1. 680,2. 754,3. 713,4. 687,4;Kiek bus 35+98?,1. 133,2. 140,3. 123,4. 138,1;";

    private final Map<Integer, Question> questions = new HashMap<>();
    private int countCorrectAnswers = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuestionTaskTeacher task = new QuestionTaskTeacher();
        task.fillQuestions();
        task.showQuestions(scanner);
        task.showMark();

    }

    private void showMark() {
        if (countCorrectAnswers < 5) {
            System.out.printf("Galejote labiau pasistengti, jus gavote %d", countCorrectAnswers);
        } else if (countCorrectAnswers > 5 && countCorrectAnswers < 8) {
            System.out.printf("Gan neblogai, jus gavote %d", countCorrectAnswers);
        } else {
            System.out.printf("Labai blogai, jus gavote %d", countCorrectAnswers);
        }
    }

    private void showQuestions(Scanner scanner) {
        int count = 1;
        Set<Integer> selectedQuestions = new HashSet<>();
        Random random = new Random();
        while (count < 11) {
            int randNumb = random.nextInt(15) + 1;
            if (selectedQuestions.contains(randNumb)) {
                continue;
            }
            showQuestion(randNumb, count, scanner);
            selectedQuestions.add(randNumb);
            count++;
        }
    }

    private void showQuestion(int randNumber, int count, Scanner scanner) {
        Question question = questions.get(randNumber);
        System.out.printf("%d %s\n", count, question.getQuestion());
        for (String a : question.getAnswers()) {
            System.out.println(a);
        }
        System.out.println("Jusu atsakymas:");
        String answer = scanner.nextLine();
        if (question.getAnswer().equals(answer)) {
            countCorrectAnswers++;
        }

    }

    private void fillQuestions() {
        int count = 1;
        String[] splittedQuestions = QUESTIONS.split(";");
        for (String q : splittedQuestions) {
            String[] splits = q.split(",");
            String[] copy = Arrays.copyOfRange(splits, 1, splits.length - 1);
            Question question = new Question(splits[0], Arrays.asList(copy), splits[splits.length - 1]);
            questions.put(count++, question);
        }
    }
}
