package daytwo;

import java.util.HashSet;
import java.util.Set;

public class SetTask {
    public static void main(String[] args) {
        Set<String> texts = new HashSet<>();
        texts.add("Vienas");
        texts.add("Du");
        texts.add("Tris");
        System.out.printf("Aibes elementai: %s, aibes dydis %d\n", texts, texts.size());
        texts.add("Vienas");
        System.out.printf("Nauji aibes elementai: %s, aibes dydis %d\n", texts, texts.size());
        System.out.printf("Ar aibeje yra elementas \"Vienas\" : %b\n", texts.contains("Vienas"));
        if(texts.contains("Vienas")){
            texts.remove("Vienas");
        } else{
            System.out.println("Nera tokio elemento");
        }
        System.out.printf("Nauji aibes elementai: %s, aibes dydis %d\n", texts, texts.size());
        texts.clear();
        System.out.printf("Nauji aibes elementai: %s, aibes dydis %d\n", texts, texts.size());
    }
}
