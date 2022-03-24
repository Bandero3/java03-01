package daythree;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tekstas");
        sb.reverse();
        String t = sb.toString();
        System.out.println(sb);
        System.out.println(t);

        String text = "Labas vakaras Jonai";
        if (true) {
            text+="!!!!";

        }
        System.out.println(text);

        StringBuilder sb2 = new StringBuilder("Labas vakaras Jonai");

        if(true){
            sb2.append("!!!!");
        }
        if(true) {
            sb2.append(20);
        }

        System.out.println(sb2);

        sb2.delete(5,13);
        sb2.append(" ").append("Test");
        System.out.println(sb2);
        sb2.insert(5, " Rytas").append(" ");
        System.out.println(sb2);

        sb2.replace(3,5, "ai");
        System.out.println(sb2);
    }
}
