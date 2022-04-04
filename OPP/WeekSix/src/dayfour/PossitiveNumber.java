package dayfour;

import java.util.List;
import java.util.Random;

public class PossitiveNumber extends  Number{

    public PossitiveNumber(int maxGenNumb, int minInterval, int maxInterval) {
        super(maxGenNumb, minInterval, maxInterval);
    }

    @Override
    public void generuok() {
        Random random = new Random();
        for(int i = 0; i< maxGenNumb; i++){
            int randNumb = random.nextInt(minInterval,maxInterval+1);
            numbers.add(randNumb);
        }
    }
}
