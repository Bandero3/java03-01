package daytree;

public class TaskTenTeacher {
    public static void main(String[] args) {
        int[] mass = {1, 2, 5, 5, 6, 6, 7, 2};
        TaskTenTeacher task = new TaskTenTeacher();
        task.printDuplicatedElements(mass);

    }
    private void printDuplicatedElements(int[] mass){
        for(int i = 0; i < mass.length; i++){
            for(int j = i+1; j < mass.length; j++){
                if(mass[i] == mass[j]){
                    System.out.printf("Duplicated element %d\n", mass[i]);
                }
            }
        }
    }
}
