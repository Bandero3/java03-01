package daythree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Asmuo {
    private final String name;
    private final String surname;

    public Asmuo(String name, String surnname) {
        this.name = name;
        this.surname = surnname;
    }

    public abstract void printInformation();

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surnname='" + surname;
    }

    public boolean AsmensMetodas(List<Asmuo> asmenys){
        List <Asmuo> newList = new ArrayList<>();
        for(Asmuo a: asmenys){
            if(!newList.contains(a)){
                newList.add(a);
            }
        }
        return asmenys.size() == newList.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asmuo asmuo = (Asmuo) o;
        return name.equals(asmuo.name) && surname.equals(asmuo.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
