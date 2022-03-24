package daytwo;

public class ConstructorExample {
    private int a;

/*    public ConstructorExample(int a){
        this.a = a;
    }*/

    public ConstructorExample (int b){
        this(0,b);
//        a = b;
    }

    public ConstructorExample(int a, int b){
        this.a = a;
    }

    public void first(int a){
        System.out.println(a);
        System.out.println(this.a);
    }
}
