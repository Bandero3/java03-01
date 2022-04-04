package dayfour;

public class MainNumber {
    public static void main(String[] args) {
        PossitiveNumber teigiamasSkaicius = new PossitiveNumber(20,100,500);
        run(teigiamasSkaicius);
        Number lyginisSkaicius = new LyginisSkaicius(30,10,200);
        run(lyginisSkaicius);
        Number nelyginisSkaicius = new NelyginisSkaicius(40,20,25);
        run(nelyginisSkaicius);
        Number neigiamasSkaicius = new NeigiamasSkaicius(50,40,500);
        run(neigiamasSkaicius);

    }

    private static void run(Number sk){
        sk.generuok();
        System.out.println(sk.sum());
    }
}
