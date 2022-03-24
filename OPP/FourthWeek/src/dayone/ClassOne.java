package dayone;

public class ClassOne {
/*    int a;

    public void setValue(int i){
        System.out.println(i);
        a+=i;
    }
    public static void staticMethod(int j){
        ClassOne classOne = new ClassOne();
        System.out.println(j);
        classOne.a+=j;
    }*/

    public static int i;

    public ClassOne() {
        System.out.println(i);
        i++;
    }
    public static void isvalyti(){
        System.out.println(i);
        i = 0;
    }
}
