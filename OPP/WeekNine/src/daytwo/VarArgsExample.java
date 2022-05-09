package daytwo;

public class VarArgsExample {

    public static void main(String[] args) {
        VarArgsExample task = new VarArgsExample();
        task.print(5,"Anton", "Anthony", "Antanas");
        task.print(5,"Anton");
    }


/*    private void print(String name){

    }
    private void print(String name, String secondName){

    }*/

    private void print(int a, String b, String... names){
        for(String name: names){
            System.out.println(name);
        }
    }

    @Override
    public String toString() {
        return "VarArgsExample{}";
    }
}
