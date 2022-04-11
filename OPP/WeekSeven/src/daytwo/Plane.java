package daytwo;

import daythree.ImportantError;
import daythree.TemporaryError;

import java.util.Random;

public class Plane {

    public void expandChassis() {
        Random random = new Random();
        int number = random.nextInt(10);

        try {
            int result = 10 / number;
            if (number == 5) {
                chassis();
            }
            System.out.println("SUCCESS: vaziuokle issiskleide");
        } catch(ImportantError e){
            System.out.println("ERROR: " + e.getReason() + " Svarbumas: svarbu");
        } catch(TemporaryError e){
            System.out.println("ERROR: " + e.getReason() + " Svarbumas: laikinas");
        } catch (ChassisExpandException e) {
            System.out.println("ERROR: " + e.getReason() + " Svarbumas: nezinomas");
        } catch (ArithmeticException e) {
            System.out.println("ERROR: vaziuokles isskleisti nepavyko");
        } finally {
            System.out.println("INFO: Lektuvas skrenda");
        }

    }

    public static void chassis() throws ChassisExpandException {
        Random random = new Random();
        int number = random.nextInt(10);
        if (number < 3) {
            throw new TemporaryError("neatsidare durys, svarbumas: laikina");
        } else if (number > 3 && number < 6) {
            throw new ImportantError("nusileido padanga, svarbumas: svarbi");
        } else if (number > 6 && number < 10) {
            throw new ChassisExpandException("padanga sprogo, svarbumas: svarbi");
        }

    }
}
