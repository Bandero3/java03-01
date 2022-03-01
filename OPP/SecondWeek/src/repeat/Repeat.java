package repeat;

import repeat.Method;

public class Repeat {
    static String text = "Anton";

    public static void main(String[] args) {
        Method method = new Method();
        method.PrintUpper(text);
        Method.PrintThirdIndex(text);
    }
}
