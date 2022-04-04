package daythree;

public class Circle extends Figure{

    public Circle(double lenght) {
        super(lenght);
    }

    @Override
    public void getArea() {
        System.out.printf("Apskritimo plotas: %.2f\n",Math.PI*Math.pow(getLenght(),2));
    }

    @Override
    public void getPerimeter() {
        System.out.printf("Apskritimo Perimetras: %.2f\n",2*Math.PI*getLenght());
    }
}
