package lt.codeacademy.child;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleService {
    private static final Logger LOG = LogManager.getLogger(SimpleService.class);
    public void sayHello(int a){
        try{
            int result = 10 / a;
            System.out.println("Labas");
        } catch (ArithmeticException e){
            System.out.println("Sorry, kazkas atsitiko");
            LOG.error("Nepavyko iskievsti serviso", e);
        }
    }
}
