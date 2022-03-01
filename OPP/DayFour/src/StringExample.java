public class StringExample {
    static String nullString;
    public static void main(String[] args) {
        String example = "Anton";
        System.out.println(example.charAt(0));
        System.out.println(nullString);
        System.out.println("");
        String textBlock = """
                <div>
                Tekstas
                </div>
                """;

        System.out.println(textBlock);
        String replace = "Jonas";
        System.out.println(replace.replace("J","p"));
        System.out.println(textBlock.length());
        String name = "Anton";
        char letter = name.charAt(4);
        System.out.println(letter);
        System.out.println(name.length());

        System.out.println(name.substring(2,3));
        System.out.println(name.substring(2));

        String s = "Mano vardas Anton";
        System.out.println(s.substring(12));
        System.out.println(s.substring(0,4));

        System.out.println(s.indexOf("v"));
        System.out.println(s.lastIndexOf("n"));
        System.out.println(s.indexOf("n"));
    }
}
