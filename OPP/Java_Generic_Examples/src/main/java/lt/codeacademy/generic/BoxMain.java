package lt.codeacademy.generic;

import java.util.ArrayList;
import java.util.List;

public class BoxMain {
    public static void main(String[] args) {
        Box box = new Box();
        box.setObject(50);

//        Integer value = (Integer) box.getObject(); visada tikrikite pries castinima
        if(box.getObject() instanceof Integer value){
            System.out.println(value);
        }

        box.setObject("50");

//        value = (Integer) box.getObject(); ClassCastException
        if(box.getObject() instanceof String value){
            System.out.println(value);
        }

        GenericBox<Integer> genericBox = new GenericBox<>();
        genericBox.setObject(50);
//        genericBox.setObject("50"); negalima, priima tik intus
        System.out.println(genericBox.getObject());

        Pair<String, Integer> pairExample = new MyPair<>("Andrius", 33);
        Pair<Double, Integer> pairExample2 = new MyPair<>(55.5, 55);

        System.out.println(pairExample.getKey());
        System.out.println(pairExample.getValue());

        //Raw tipas
        GenericBox rawGenericBox = new GenericBox();
        rawGenericBox.setObject("50");
        rawGenericBox.setObject(50);

        BoxMain main = new BoxMain();

        main.testGenericMethod("Test");
        main.testGenericMethod(50);
        main.testGenericMethod(true);
        main.testGenericMethod(genericBox);

        main.testGenericMethod2(50);
        String o = main.testGenericMethod4();

        Pair<String, String> p1 = new MyPair<>("As", "Jis");
        Pair<String, String> p2 = new MyPair<>("Tu", "Jis");
        System.out.println(PairComparator.compare(p1,p2));

        Calculator<Integer> calculator = new Calculator<>(50,50);
        Number sum = calculator.sum();
        System.out.println(sum);

        GenericBox<Number> numberBox = new GenericBox<>();
        GenericBox<Integer> interBox = new GenericBox<>();
        main.testParameter(numberBox);
//        main.testParameter(interBox);

        List<Integer> intList = List.of(12, 3, 66);
        List<Double> doubleList = List.of(55.5, 88.5, 88.5);

        main.printList(intList);
        main.printList(doubleList);
    }
    private void printList(List<?> list){
        list.forEach(System.out::println);
    }


/*    private void printList(List<? extends Number> list){
        list.forEach(System.out::println);
    }*/

    private void testParameter(GenericBox<Number> box){

    }

    private <E> void testGenericMethod(E element){

    }

    private <E> E testGenericMethod2(E e){
        return e;
    }

    private <K,V> void testGenericMethod3(K k, V v){

    }

    private <E> E testGenericMethod4(){
        return null;
    }
}
