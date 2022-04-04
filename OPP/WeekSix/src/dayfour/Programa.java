package dayfour;

public class Programa {
    public static void main(String[] args) {
        DuomenuBaze db = new DuomenuBaze();
        NutolesDiskas nd = new NutolesDiskas();

        Info info1 = new Info(1, "Pirmadienis");
        Info info2 = new Info(2, "Antradienis");
        Info info3 = new Info(3, "Treciadienis");


        saugoti(db, info1);
        saugoti(nd, info1);
        System.out.println("*********************");
        rastiPagalId(db, 2);
        rastiPagalId(nd, 2);
        System.out.println("*********************");
        rastiZodi(db, "Ant");
        rastiZodi(nd, "Ant");


    }

    private static void saugoti(Saugykla saugykla, Info info) {
        saugykla.saugotiInfo(info);
    }

    private static void rastiPagalId(Saugykla saugykla, int id) {
        System.out.println(saugykla.rastiInfo(id));
    }

    private static void rastiZodi(Saugykla saugykla, String zodis) {
        System.out.println(saugykla.rastiInfo(zodis));
    }

}
