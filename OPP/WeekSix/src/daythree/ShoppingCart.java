package daythree;

public class ShoppingCart implements Cart, Cart2 {
    @Override
    public void printCartInfo() {
        System.out.println("Cart info");
    }

    @Override
    public double getCardAmount() {
        return 22.5;
    }

    public void testMethod() {
        System.out.println("Method");
    }

    @Override
    public void testDefault() {
        System.out.println("cart default");
    }

    @Override
    public void secondCartMethod() {

    }
}
