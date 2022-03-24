package daytwo;

import java.util.LinkedList;

public class TaskSeven {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        words.add("yes");
        words.add("no");
        words.add("maybe");
        System.out.println(words);
        System.out.printf("%s paskutinis elementas, %s pirmas elementas\n", words.getLast(),words.getFirst());
        System.out.println(words);
        System.out.printf("%s paskutinis elementas, %s pirmas elementas\n", words.pollLast(),words.pollFirst());
        System.out.println(words);
        words.push("definetly");
        System.out.println(words);
        words.pop();
        System.out.println(words);
    }
}
