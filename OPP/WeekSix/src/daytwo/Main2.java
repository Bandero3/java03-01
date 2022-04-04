package daytwo;

public class Main2 {
    public static void main(String[] args) {
        C c = new C();
        B b = new B();

        System.out.println(c instanceof C);
        System.out.println(c instanceof B);
        System.out.println(b instanceof C); // vaikas i teva neziuri

        Vaisius vaisius = new Vaisius();
        EgzotinisVaisius egzotinisVaisius = new EgzotinisVaisius();
        LietuviskasVaisius lietuviskasVaisius = new LietuviskasVaisius();
        Ananasas ananasas = new Ananasas();
        Mangas mangas = new Mangas();
        Kriause kriause = new Kriause();
        Obuolys obuolys = new Obuolys();
        Alyvinis alyvinis = new Alyvinis();
        Antaninis antaninis = new Antaninis();

        vaisius.whatAmI();
        egzotinisVaisius.whatAmI();
        lietuviskasVaisius.whatAmI();
        ananasas.whatAmI();
        mangas.whatAmI();
        kriause.whatAmI();
        obuolys.whatAmI();
        alyvinis.whatAmI();
        antaninis.whatAmI();
    }
}
