package dayone;

public class TeacherTaskTwo {
    //    public static int count;
//    public static final int COUNT = 0;
    public final int COUNT;

    /*    public TeacherTaskTwo(){
            System.out.printf("Reiksme yra: %d\n",count++);
        }*/
    public TeacherTaskTwo() {
        COUNT = 0;
    }

    public static void cleanUp() {
//        System.out.printf("Pries isvalant %d\n", count);
//        count = 0;
    }
}

class TaskTwoMain {
    public static void main(String[] args) {
        new TeacherTaskTwo();
//        System.out.println(TeacherTaskTwo.count);
        new TeacherTaskTwo();
        new TeacherTaskTwo();
        new TeacherTaskTwo();
        new TeacherTaskTwo();
        TeacherTaskTwo.cleanUp();

    }
}
