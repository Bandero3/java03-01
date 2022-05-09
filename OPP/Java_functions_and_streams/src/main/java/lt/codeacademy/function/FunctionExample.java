package lt.codeacademy.function;

import java.util.function.*;

public class FunctionExample {
    public static void main(String[] args) {

        FunctionExample task = new FunctionExample();

        Supplier<Integer> supplier = () -> 50;


        //nereikia jei yra viena eilute!
/*        Supplier<Integer> supplier = () -> {
            int a = 50;
            return a;
        };*/

        System.out.println(supplier.get());
        task.testSupplier(() -> 60);
        task.testSupplier(supplier);

        //Skliausteliai nera butini (value) jei yra vienas parametras
//        Consumer<String> consumer = (value) -> System.out.println(value.toUpperCase());
        Consumer<String> consumer = value -> System.out.println(value.toUpperCase());

        consumer.accept("Andrius");

        Function<Integer, String> function = value -> String.valueOf(value * 10);

        String result = function.apply(10);
        System.out.println(result);

        Predicate<String> predicate = value -> value != null && value.startsWith("test");
        if (predicate.test("testing")) {
            System.out.println("Praleidzaim");
        } else {
            System.out.println("Nepavyko");
        }

        int action = 1;

        switch (action) {
            case 1 -> System.out.println("Vienas");
            case 2 -> System.out.println("Du");
            default -> System.out.println("Nera");
        }

        IntConsumer intConsumer = value -> System.out.println(value);
        intConsumer.accept(500);

        BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println(x * y);
        biConsumer.accept(50, 80);

        BiPredicate<String, String> biPredicate = (v1, v2) -> v1 != null && v1.equals(v2);
        System.out.println(biPredicate.test("a", "aa"));

        BiFunction<Integer, Integer, String> biFunction = (x, y) -> String.valueOf(x * y);
        biFunction.apply(50, 10);

        MyFunctionalInterface myFunctionalInterface = (v1, v2, v3) -> System.out.println(v1 + v2 + v3);
        myFunctionalInterface.doSomething(50, 50, 40);

        task.createFunctionalInterface().doSomething(40, 50, 10);
        task.testMyFunctionalInterface((a, b, c) -> System.out.println(a / c * b));
        task.testMyFunctionalInterface((a, b, c) -> System.out.println(a * c - b));

//        BiFunction<Integer,Integer,Integer> myFunction = (v1, v2) -> v1*v2;
        BiFunction<Integer, Integer, Integer> myFunction = task::sum;
//        BiFunction<Integer, Integer, Integer> myFunction = (a,b) -> {
//        return task.sum(a,b);
//    };
        int value = myFunction.apply(50, 70);
        System.out.println(value);
    }



    private int sum(int a, int b) {
        return a + b;
    }

    public void testSupplier(Supplier<Integer> supplier) {
        System.out.println(supplier.get());
    }

    private MyFunctionalInterface createFunctionalInterface() {
        return (v1, v2, v3) -> System.out.println(v1 - v2 * v3);
    }

    private void testMyFunctionalInterface(MyFunctionalInterface function) {
        function.doSomething(50, 70, 80);
    }
}
