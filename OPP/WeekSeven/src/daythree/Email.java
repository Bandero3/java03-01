package daythree;

public class Email {
    private final String receiver;
    private final String subject;
    private final String content;
    private Status status;

    public Email(String receiver, String theme, String content) {
        this.receiver = receiver;
        this.subject = theme;
        this.content = content;
        status = Status.NEW;
    }

    public String getContent() {
        return content;
    }

    public String getSubject() {
        return subject;
    }

    public String getReceiver() {
        return receiver;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
