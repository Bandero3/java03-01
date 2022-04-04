package daytwo;

public class Asmuo {
    private final String name;
    private final String surnamename;

    public Asmuo(String name, String surnamename) {
        this.name = name;
        this.surnamename = surnamename;
    }

    @Override
    public String toString() {
        return "Asmuo[" +
                "vardas='" + name + '\'' +
                ", pavarde='" + surnamename + '\'' +
                ']';
    }
}
