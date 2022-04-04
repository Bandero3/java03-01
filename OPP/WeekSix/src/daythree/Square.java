package daythree;

public class Square extends Figure{

    public Square(double lenght) {
        super(lenght);
    }

    @Override
    public void getArea() {
        System.out.printf("Kvadrato plotas: %.2f\n",Math.pow(getLenght(),2));
    }

    @Override
    public void getPerimeter() {
        System.out.printf("Kvadrato perimetras: %.2f\n",4*getLenght());

    }
}
