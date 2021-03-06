import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class MyNewThread extends Thread{
    @Override
    public void run() {
        while(true){
            try(Stream<Path> walk = Files.walk(Path.of("C:\\Users\\User\\Desktop"))){
                walk.forEach(f-> System.out.println(f.getFileName()));
                TimeUnit.SECONDS.sleep(5);
            } catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
