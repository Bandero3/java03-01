package lt.codeacademy.function;

class TestClass{
    public String testMethod(String value){
        return "testMethod " + value;
    }

    public static String secondMethod(String value){
        return "second " + value;
    }
}



interface Tranform{
    String transform(TestClass testClass, String value);

    default String testTransformMethod(String value){
        return "testTransformMethod " + value;
    }
}

interface  SecondTransform{
    String getValue(String value);
}

public class UnboundedMethodReference {
    public static void main(String[] args) {
        //1. nuoroda/ referencas perduodant deklaracija kvietimo metu
        Tranform tranform = TestClass::testMethod;
        System.out.println(tranform.testTransformMethod("Value"));

        TestClass testClass = new TestClass();
        String kazkas = tranform.transform(testClass, "kazkas");
        System.out.println(kazkas);
        System.out.println(testClass.testMethod("kazkas2"));

        //2. referencas is kurto objekto
        SecondTransform secondTransform = testClass::testMethod;
        System.out.println(secondTransform.getValue("Mano kazkokia reiksme"));

        //3. referencas kai metodas statinis
        SecondTransform reference = TestClass::secondMethod;
        System.out.println(reference.getValue("Nauja reiksme"));
    }
}
