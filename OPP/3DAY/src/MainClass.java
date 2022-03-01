public class MainClass {
    public static void main(String[] args) {
        Figura figura1 = new Figura();
        figura1.setName("Trikampis");
        figura1.setHeight(4);
        figura1.setWidth(6);

        Figura figura2 = new Figura();
        figura1.setName("Stačiakampis");
        figura1.setHeight(6);
        figura1.setWidth(5);

        System.out.println(figura1.getName() + " Aukštis: " + figura1.getHeight() + " Plotis: " + figura1.getWidth());
        System.out.println(figura2.getName() + " Aukštis: " + figura2.getHeight() + " Plotis: " + figura2.getWidth());
    }
}
