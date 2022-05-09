package lt.codeacademy.generic;

import java.util.List;

interface Medis {
    void turi();
}

class Lapuotis implements Medis {
    public void turi() {
        System.out.println(getClass().getSimpleName() + " turi lapus");
    }
}

class Spygliuotis implements Medis {
    public void turi() {
        System.out.println(getClass().getSimpleName() + " turi spyglius");
    }
}

class Azuolas extends Lapuotis {
}

class Berzas extends Lapuotis {
}

class Egle extends Spygliuotis {
}

class Pusis extends Spygliuotis {
}

class Kadagys extends Spygliuotis {
}

public class Tree {
    public static void main(String[] args) {
        Tree task = new Tree();
        List<Berzas> berzai = List.of(new Berzas(), new Berzas(), new Berzas());
        task.berzuSarasas(berzai);


    }

    private void ivairusMiskas(List<?> trees){
        System.out.println("Ivairus miskas");
    }

    private void spygliuociuMiskas(List<? super Spygliuotis> trees){
        System.out.println("Spygliuociu miskas");
    }

    private void berzuSarasas(List<Berzas> trees){
        System.out.println("Berzu miskas");
        trees.forEach(berzas -> berzas.turi());
    }
}
