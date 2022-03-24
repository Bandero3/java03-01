package dayone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TeacherThree {
    public static void main(String[] args) {
        List<String> texts = List.of("Petras", "Vilnius", "Klaipeda", "Kazkas");

        String text = "";

        for (String t : texts) {
            if (t.length() > text.length()) {
                text = t;
            }
        }
        System.out.println(text);

        List<String> names = new ArrayList<>();
        names.add("Petras");
        names.add("Vilnius");
        names.add("Klaipeda");
        names.add("Kazkas");

        names.sort(sortbyTextLenght);
        System.out.println(names.get(0));

/*        names.sort((o1, o2) -> {
            if (o1.length() == o2.length()) {
                return 0;
            }
            return o1.length() > o2.length() ? -1 : 1;
        });
        System.out.println(names.get(0));*/
    }

    public static Comparator<String> sortbyTextLenght = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            if (o1.length() == o2.length()) {
                return 0;
            }
            return o1.length() > o2.length() ? -1 : 1;
        }
    };
}
