package lt.code.academy.first;

import lt.code.academy.second.SecondSampleClass;

public class ClassSample {
    static int age = 10;

    public static void main(String[] args) {
        int b = 5;
        System.out.println(age);

        //sukuriamas second class objektas
        SecondSampleClass secondSampleClass = new SecondSampleClass();
        SecondSampleClass secondSampleClass2 = new SecondSampleClass();
        System.out.println(secondSampleClass.size);
        secondSampleClass.test();
        System.out.println(secondSampleClass);
        System.out.println(secondSampleClass2);
    }

    //    public static void test(){
//        System.out.println(b);
//    }
    private class InnerClass {

    }
}

class Testing {

}
