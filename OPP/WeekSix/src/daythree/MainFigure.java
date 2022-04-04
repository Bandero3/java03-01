package daythree;

public class MainFigure {
    public static void main(String[] args) {
        Figure a = new Circle(5);
        Figure k = new Square(6);

        a.getArea();
        a.getPerimeter();

        k.getArea();
        k.getPerimeter();
    }
}
