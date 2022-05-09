import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class ProgressRunnable implements Runnable{

    private ProgressBar progressBar;
    private final AtomicBoolean atomicBoolean;

    public ProgressRunnable(ProgressBar progressBar) {
        this.progressBar = progressBar;
        atomicBoolean = new AtomicBoolean(true);
    }

    public void stopProgress(){
        atomicBoolean.set(false);
    }

    @Override
    public void run() {
        try {
            while(atomicBoolean.get()){
                TimeUnit.SECONDS.sleep(3);
                System.out.println("Jusu progresas: " + progressBar.getProgress());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
