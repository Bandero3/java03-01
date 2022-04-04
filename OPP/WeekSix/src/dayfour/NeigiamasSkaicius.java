package dayfour;

import java.util.Random;

public class NeigiamasSkaicius extends Number{
    public NeigiamasSkaicius(int maxGenNumb, int minInterval, int maxInterval) {
        super(maxGenNumb, minInterval, maxInterval);
    }

    @Override
    public void generuok() {
        Random random = new Random();
        for(int i = 0; i< maxGenNumb; i++){
            int randNumb = random.nextInt(minInterval,maxGenNumb+1);
            numbers.add(randNumb*-1);
        }
    }
}
