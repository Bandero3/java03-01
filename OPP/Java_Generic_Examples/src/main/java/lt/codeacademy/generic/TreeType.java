package lt.codeacademy.generic;

public enum TreeType {
    AZUOLAS("Azuoliukas"),
    BERZAS("Berzas"),
    EGLE("Egle"),
    PUSIS("Pusis"),
    KADAGYS("Kardagys");

    private final String name;

    TreeType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
