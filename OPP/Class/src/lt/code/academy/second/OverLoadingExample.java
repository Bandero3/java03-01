package lt.code.academy.second;

public class OverLoadingExample {
    public static void main(String[] args) {

        OverLoadingExample overLoadingExample = new OverLoadingExample();
        System.out.println(overLoadingExample.sum(5,5));
        System.out.println(overLoadingExample.sum(5.5,5.5));
    }

    public int sum(int numb, int secondNumb){
        return numb + secondNumb;
    }

    public double sum(double numb, double secondNumb){
        return numb + secondNumb;
    }
}
