package daythree;

public interface Cart{

//    public final String name = "Petras";
    String name = "Petras";

    void printCartInfo();
    double getCardAmount();
    default void testDefault(){
        System.out.println("Interface default method");
    }
}
