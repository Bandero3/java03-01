package dayfour;

import java.util.ArrayList;
import java.util.List;

public abstract class Number {
    protected final List<Integer> numbers;
    protected final int maxGenNumb;
    protected final int minInterval;
    protected final int maxInterval;

    public Number(int maxGenNumb, int minInterval, int maxInterval) {
        this.maxGenNumb = maxGenNumb;
        this.minInterval = minInterval;
        this.maxInterval = maxInterval;
        this.numbers = new ArrayList<>();
    }



    public abstract void generuok();

    public int sum(){
        int sum = 0;
        for(Integer numb: numbers){
            sum+=numb;
        }
        return sum;
        //return numbers.stream().reduce(0, Integer::sum);
        //return numbers.stream().reduce(0,(numb1,numb2) -> numb1 + numb2);
    }
}
