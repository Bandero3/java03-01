package day.one;

public class StringExample {
    public static void main(String[] args) {
        String a = "Anton";
        String b = "Januskevic";
        String nullString = null;
        System.out.println(a.equals(b));

/*        if (nullString != null) {
            System.out.println(nullString.equals(b));
        }*/

        System.out.println(b.equals(nullString));

        System.out.println("Aaaa".equals("aaaa"));
        System.out.println("Aaaa".equalsIgnoreCase("aaaa"));

        String one = "Aaa";
        String two = "Aab";

        System.out.println(one.compareTo(two));
        System.out.println(two.compareTo(one));
        System.out.println(two.compareTo(two));

        System.out.println(one.concat(" ".concat(two)));

        System.out.println(" ".isBlank());
        System.out.println("".isEmpty());

        String[] as = two.split("a");
        System.out.println(as[0]+ " " + as[1]);

        int numb1 = 5555;
        String convNumb = numb1 + "";
        int numb = Integer.parseInt(convNumb);
        Integer numb3 = Integer.valueOf(convNumb);

        String stringNumb = String.valueOf(numb1);
        System.out.println(stringNumb);

        String c = "s";
        String d = "S";
        System.out.println(d.compareTo(c));
    }
}
