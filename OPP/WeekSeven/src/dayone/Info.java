package dayone;

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

    public String getText() {
        return tekstas;
    }


    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", tekstas='" + tekstas + '\'' +
                '}';
    }

    public boolean isInText(String text) {
        return tekstas.contains(text);
    }
}

