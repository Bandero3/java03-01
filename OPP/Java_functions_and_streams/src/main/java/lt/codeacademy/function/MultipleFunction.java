package lt.codeacademy.function;

import java.util.function.Function;

public class MultipleFunction {
    private String value;
    public static void main(String[] args) {

/*        Function<String, Function<String, String>> multipleFunction = value -> {
            Function<String, String> otherFunction = value2 -> value + " " + value2;
            return otherFunction;
        };*/

        Function<String, Function<String,String>> multipleFunction = value -> value2 -> value + " " + value2;

        String result = multipleFunction.apply("Pirmas").apply("Antras");
        System.out.println(result);

/*        Function<String,String> result = multipleFunction.apply("Pirmas");
        String result1 = result.apply("Antras");
        System.out.println(result1);*/

        MultipleFunction mf = new MultipleFunction();
        String value = mf.first("Testas").second("kitas");
        System.out.println(value);
    }

    public MultipleFunction first(String value){
        this.value = value;
        return this;
    }

    public String second(String value){
        return this.value + " " + value;
    }
}
