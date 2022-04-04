package dayfour;

public class KaskoDraudimas extends AutomobilioDraudimas{
    private final double francize;

    public KaskoDraudimas(String draudejas, String autoNr, String salis, int suma, double francize) {
        super(draudejas, autoNr, salis, suma);
        this.francize = francize;
    }


    public double getFrancize() {
        return francize;
    }
}
