package dayfour;

public class MainDraudimas {
    public static void main(String[] args) {
        Draudimas tpvca = new TPVCADraudimas("Andrius Baltrunas", "LGH999","LT", 180);
        Draudimas kasko = new KaskoDraudimas("Jonas Jonaitis","KGT714","LT", 250, 95);

        TPVCADraudimas tpvc2 = new TPVCADraudimas("Andrius Baltrunas", "LGH999","LT", 180);
        AutomobilioDraudimas tpvc3 = new TPVCADraudimas("Andrius Baltrunas", "LGH999","LT", 180);

        tpvc2.getAutoNr();
        tpvc3.getAutoNr();

        System.out.printf("Draudejas: %s, suma: %s\n",tpvca.getDraudejas(),tpvca.getSuma());
        System.out.printf("Draudejas: %s, suma: %s\n",kasko.getDraudejas(),kasko.getSuma());

        System.out.println(((AutomobilioDraudimas) tpvca).getAutoNr());
        System.out.println(((AutomobilioDraudimas) kasko).getAutoNr());

        System.out.println(((KaskoDraudimas)kasko).getFrancize());

        if(tpvca instanceof KaskoDraudimas k){
            System.out.println(k.getFrancize());
        }
    }
}
