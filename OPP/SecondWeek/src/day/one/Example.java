package day.one;

import java.util.Locale;

public class Example {

    public static void main(String[] args) {
        Example example = new Example();
        String text = "Namas";
        text = example.changeOne(text,'s','i');
        text = example.changeTwo(text);
        text = example.changeThree(text);
        text = example.changeFour(text);
        text = example.changeOne(text,'m','n');
        example.changeFive(text,'n');
    }

    private String changeOne(String text,char a, char b) {
        String changed = text.replace(a, b);
        System.out.printf("\"%s\" -> \"%s\"\n", text, changed);

        return changed;
    }
    private String changeTwo(String text){
        String changed = text.toUpperCase(Locale.ROOT);
        System.out.printf("\"%s\" -> \"%s\"\n", text, changed);
        return changed;
    }
    private String changeThree(String text){
        String changed = text.substring(2,4);
        System.out.printf("\"%s\" -> \"%s\"\n", text, changed);
        return changed;
    }
    private String changeFour(String text){
//        String changed = text + "ma";
//        String changed = text.concat("ma");
        String changed = text.concat(text.toLowerCase());
        System.out.printf("\"%s\" -> \"%s\"\n", text, changed);
        return changed;
    }

    private void changeFive(String text, char letter){
        System.out.printf("\"%s\" -> \"%s\"\n", text, text.indexOf(letter));
    }
}


