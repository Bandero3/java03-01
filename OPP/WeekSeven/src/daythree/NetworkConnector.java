package daythree;

import java.util.Random;

public class NetworkConnector {

    public void send(Email email) throws NoNetworkException {
        Random random = new Random();
        int n = random.nextInt(10);
        try{
            int i = 1/n;
            email.setStatus(Status.SENT);
            System.out.printf("Email to %s delivered\n",email.getReceiver());
            System.out.println(" ");

        } catch (ArithmeticException e){
            email.setStatus(Status.RESENDING);
            System.out.printf("Failed to send email to %s\n", email.getReceiver());
            System.out.println(" ");
            throw new NoNetworkException();
        }

    }
}
