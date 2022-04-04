package daythree;

public class Studentas extends Asmuo{
    public Studentas(String name, String surnname) {
        super(name, surnname);
    }

    @Override
        public void printInformation() {
        //System.out.println(super.toString());
        System.out.println("Studentas " + this);
        }
}
