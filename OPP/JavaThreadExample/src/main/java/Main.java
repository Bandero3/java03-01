import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ProgressBar progressBar = new ProgressBar();
        Thread thread = new Thread(new ProgressRunnable(progressBar));
        thread.start();
        for(int i = 0; i<100; i++){
            TimeUnit.SECONDS.sleep(1);
            progressBar.increaseProgress();
        }

    }
}
