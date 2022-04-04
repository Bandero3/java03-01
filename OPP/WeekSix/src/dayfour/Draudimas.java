package dayfour;

public abstract class Draudimas {
    private final String draudejas;
    private final String salis;
    private final int suma;

    public Draudimas(String draudejas, String salis, int suma) {
        this.draudejas = draudejas;
        this.salis = salis;
        this.suma = suma;
    }

    public String getDraudejas() {
        return draudejas;
    }

    public String getSalis() {
        return salis;
    }

    public int getSuma() {
        return suma;
    }
}
