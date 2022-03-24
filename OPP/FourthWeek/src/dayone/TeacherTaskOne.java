package dayone;

public class TeacherTaskOne {
    private int i;

    public void setValue(int i){
        System.out.println(i);
        i = i;
    }
    public static void staticMethod(int j){
        System.out.println(j);
        //i = j;
    }
}

class TaskOneMain{
    public static void main(String[] args) {
        TeacherTaskOne.staticMethod(10);
        TeacherTaskOne task = new TeacherTaskOne();
        task.setValue(10);
    }
}