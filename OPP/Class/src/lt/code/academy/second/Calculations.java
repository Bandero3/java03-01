package lt.code.academy.second;

public class Calculations {
    public void triangleArea(double a, double b) {
        System.out.println("Trikampio plotas: " + (a * b) / 2);
    }

    public void rectangleArea(double a, double b) {
        System.out.println("Staciakampio plotas: " + a * b);
    }

    public void squareArea(double a) {
        System.out.println("Kvadrato plotas: " + a * a);
        System.out.println("Kvadrato plotas: " + Math.pow(a,2));
        int z = 5;
        int y = 5^2;

    }

    public void circleArea(double a) {
        System.out.println("Apskritimo plotas: " + 3.1415 * (a * a));
    }
}
