package daythree;

import java.util.List;

public class EmailSender {

    NetworkConnector networkConnector = new NetworkConnector();

    public void sendEmail(List<Email> emails){
        for(Email email: emails){
            try {
                System.out.printf("Sending email to %s\n", email.getReceiver());
                networkConnector.send(email);
            } catch (NoNetworkException e) {
                System.out.printf("Redelivering email to %s\n", email.getReceiver());
                try {
                    Thread.sleep(3000);
                    networkConnector.send(email);

                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                } catch (NoNetworkException ex) {
                    System.out.println("Email sending failed");
                }
            }
        }
    }
}
