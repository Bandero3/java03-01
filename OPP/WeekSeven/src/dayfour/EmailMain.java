package dayfour;

import java.util.ArrayList;
import java.util.List;

public class EmailMain {
    public static void main(String[] args) {
        List<Email> emails = List.of(new Email("test", "subject test", "test@g.com"),
                new Email("test1", "subject test1", "test1@g.com"),
                new Email("test2", "subject test2", "test2@g.com"),
                new Email("test3", "subject test3", "test3@g.com"),
                new Email("test4", "subject test4", "test4@g.com"),
                new Email("test5", "subject test5", "test5@g.com"));

        EmailSender sender = new EmailSender();
        sender.sendEmails(emails);
    }

}
