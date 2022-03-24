package dayone;

public class TaskFour {
    final int a;
    int b;

    public TaskFour(int a){
        this.a = a;
    }

    public void change(int a, int b){
//        this.a=a;
        this.b=b;
        System.out.println(this.a);
        System.out.println(this.b);
    }
}
class TaskFourMain{
    public static void main(String[] args) {
        TaskFour task1 = new TaskFour(10);
        TaskFour task2 = new TaskFour(10);
        TaskFour task3 = new TaskFour(10);
        task1.change(10,5);
        task2.change(10,5);
        task3.change(10,5);
    }

}