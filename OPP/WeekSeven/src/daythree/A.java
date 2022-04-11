package daythree;

public class A{
    public static void main(String[] args) {
        B b = new B();
        try {
            b.methodB();
        } catch (Exception e) {
            System.out.println("Ivyko klaida " + e.getMessage());
        }
    }
}


class B{
    public void methodB() throws Exception {
        C c = new C();
        c.methodC();
    }
}

class C{
    public void methodC() throws Exception {
        throw new Exception("C klases metodo klaida");
    }
}
