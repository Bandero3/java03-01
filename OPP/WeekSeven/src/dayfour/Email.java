package dayfour;

public class Email {
    private final String body;
    private final String subject;
    private final String recipient;
    private EmailStatus status;

    public Email(String body, String subject, String recipient) {
        this.body = body;
        this.subject = subject;
        this.recipient = recipient;
        status = EmailStatus.NEW;
    }

    public String getBody() {
        return body;
    }

    public String getSubject() {
        return subject;
    }

    public String getRecipient() {
        return recipient;
    }

    public EmailStatus getStatus() {
        return status;
    }

    public void setStatus(EmailStatus status) {
        this.status = status;
    }
}
