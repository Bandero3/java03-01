import java.util.Scanner;
import com.github.pemistahl.lingua.api.*;
import static com.github.pemistahl.lingua.api.Language.*;

public class MainLingua {
    private static final int MAX = 10;
    public static void main(String[] args) {
        final LanguageDetector detector = LanguageDetectorBuilder.fromLanguages(ENGLISH, FRENCH, GERMAN, SPANISH, POLISH).build();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite 10 zodziu ar sakyniu");
        for(int i = 0; i< MAX; i++){
            Language detectedLanguage = detector.detectLanguageOf(scanner.nextLine());
            System.out.println(detectedLanguage);
        }
    }
}
