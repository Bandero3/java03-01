package lt.codeacademy.child;

import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOG = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Faker faker = new Faker();
        LOG.info("faker sukurtas {}", faker);
        LOG.debug("main argument {}",args);
        LOG.error("Kazkas negerai su facker");
        LOG.trace("Trace logger");

        System.out.println(faker.country().capital());

        new SimpleService().sayHello(0);
    }
}
