package daythree;

public class Destytojas extends Asmuo{

    public Destytojas(String name, String surnname) {
        super(name, surnname);
    }

    @Override
    public void printInformation() {
        //System.out.println(super.toString());
        System.out.println("Destytojas " + this);
    }
}
