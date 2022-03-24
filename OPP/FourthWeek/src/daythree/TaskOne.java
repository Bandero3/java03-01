package daythree;

public class TaskOne {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Liepa");
        StringBuilder text2 = new StringBuilder("Antradienis");

        text.append(text2);
        System.out.println(text);
        text.reverse();
        System.out.println(text);
        text.delete(0,5);
        text.delete(4,6);
        text.delete(5,7);
        text.deleteCharAt(6);
        System.out.println(text);
        text.replace(3,6, "2018");
        System.out.println(text);
        text.insert(3, "om ");
        System.out.println(text);
        text.delete(0,7);
        text.deleteCharAt(2);
        text.reverse();
        System.out.println(text);
    }
}
