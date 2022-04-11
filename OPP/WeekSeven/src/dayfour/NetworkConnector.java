package dayfour;

import java.util.Random;

public class NetworkConnector {
    public void send(Email email){
        Random random = new Random();
        int numb = random.nextInt(10);
        try{
            int i = 1/numb;
        } catch(ArithmeticException e){
            throw new NoNetworkException();
        }
    }

}
