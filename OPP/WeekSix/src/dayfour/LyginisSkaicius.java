package dayfour;

import java.util.List;
import java.util.Random;

public class LyginisSkaicius extends Number{


    public LyginisSkaicius(int maxGenNumb, int minInterval, int maxInterval) {
        super(maxGenNumb, minInterval, maxInterval);
    }

    @Override
    public void generuok() {
        Random random = new Random();
        int count =0;
        while(count != maxGenNumb){
            int randNumb = random.nextInt(minInterval,maxInterval+1);
            if(randNumb %2 == 0){
                numbers.add(randNumb);
                count++;
            }
        }

    }
}
