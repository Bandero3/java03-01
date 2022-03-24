package daytwo;

public class TaskFour {
    private static int a;
    private static final int b = 0;

    public void assign(int a, int b){
        this.a = a;
//        this.b = b;

        System.out.println(this.a);
        System.out.println(this.b);
    }
}
class TaskFourMain{
    public static void main(String[] args) {
        TaskFour task1 = new TaskFour();
        TaskFour task2 = new TaskFour();
        TaskFour task3 = new TaskFour();
        task1.assign(10,5);
        task1.assign(15,10);
        task1.assign(20,15);
    }
}