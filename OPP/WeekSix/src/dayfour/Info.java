package dayfour;

public class Info {
    private final int id;
    private final String tekstas;

    public Info(int id, String tekstas) {
        this.id = id;
        this.tekstas = tekstas;
    }

    public int getId() {
        return id;
    }

    public String getTekstas() {
        return tekstas;
    }


    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", tekstas='" + tekstas + '\'' +
                '}';
    }

    public boolean arYraTekste(String zodis) {
        return tekstas.contains(zodis);
    }
}
