package repeat;

public class Method {

    public void PrintUpper(String text) {
        System.out.println(text.toUpperCase());
        TextLenght(text);

    }

    private void TextLenght(String text) {
        System.out.println(text.length());
    }

    public static void PrintThirdIndex(String text) {
        System.out.println(text.charAt(3));
    }
}
