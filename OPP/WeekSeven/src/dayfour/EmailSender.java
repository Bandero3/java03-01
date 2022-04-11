package dayfour;

import java.util.List;

public class EmailSender {
    NetworkConnector connector = new NetworkConnector();
    public void sendEmails(List<Email> emails){

        for(Email email: emails){
            sendEmail(connector,email);
        }
    }

    private void sendEmail(NetworkConnector connector, Email email){
        try{
            System.out.printf("%s email to %s\n", EmailStatus.RESEND.equals(email.getStatus()) ? "Resending" : "Sending", email.getRecipient());
            connector.send(email);
            System.out.printf("Email to %s delivered\n\n", email.getRecipient());
            email.setStatus(EmailStatus.SENT);
        } catch(NoNetworkException e){
            email.setStatus(EmailStatus.RESEND);
            System.out.printf("Failed to send email to %s\n\n", email.getRecipient());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            sendEmail(connector,email);
        }
    }
}
