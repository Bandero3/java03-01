package lt.codeacademy.generic;

import java.util.List;

interface MedisT{
    void turi();
}

class LapuotisT implements MedisT{
    private final TreeType treeType;

    public LapuotisT(TreeType treeType) {
        this.treeType = treeType;
    }

    @Override
    public void turi() {
        System.out.printf("%s turi lapus\n",treeType.getName());
    }
}

class SpygliuotisT implements MedisT{

    private final TreeType treeType;

    public SpygliuotisT(TreeType treeType) {
        this.treeType = treeType;
    }

    @Override
    public void turi() {
        System.out.printf("%s turi spiglius\n", treeType.getName());
    }
}

class AzuolasT extends LapuotisT{

    public AzuolasT() {
        super(TreeType.AZUOLAS);
    }
}
class BerzasT extends LapuotisT{

    public BerzasT() {
        super(TreeType.BERZAS);
    }
}

class EgleT extends SpygliuotisT{

    public EgleT() {
        super(TreeType.EGLE);
    }
}

class PusisT extends SpygliuotisT{

    public PusisT() {
        super(TreeType.PUSIS);
    }
}

class KadagysT extends SpygliuotisT{

    public KadagysT() {
        super(TreeType.KADAGYS);
    }
}

public class TreeTeacher {
    public static void main(String[] args) {
        TreeTeacher task = new TreeTeacher();
        task.ivairusMiskas(List.of(new BerzasT(), new PusisT()));

        List<MedisT> medis = List.of(new BerzasT(), new PusisT());
        List<LapuotisT> lapuociai = List.of(new BerzasT(), new AzuolasT());

        task.ivairusMiskas(lapuociai);
        task.ivairusMiskas(medis);

        List<SpygliuotisT> spygliuotis = List.of(new PusisT(), new KadagysT(), new EgleT());
        List<EgleT> egles = List.of(new EgleT());
        task.spygliuociuMiskas(spygliuotis);
        task.spygliuociuMiskas(egles);

        List<BerzasT> berzai = List.of(new BerzasT());
        task.berzuMiskas(berzai);

    }
    private void ivairusMiskas(List<? extends MedisT> trees){
        System.out.println("Ivairus miskas");
        trees.forEach(MedisT::turi);
    }

    private <T extends SpygliuotisT> void spygliuociuMiskas(List<T> trees){
        System.out.println("Spygliuociu miskas");
        trees.forEach(SpygliuotisT::turi);
    }

    private void berzuMiskas(List<BerzasT> trees){
        System.out.println("Berzu miskas");
        trees.forEach(BerzasT::turi);
    }

}
