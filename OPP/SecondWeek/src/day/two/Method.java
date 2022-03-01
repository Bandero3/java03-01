package day.two;

public class Method {

    public void calculate(String line) {
//        char c = line.charAt(3);
        int a = Integer.parseInt(line.substring(0,line.indexOf('+')).trim());
        int b = Integer.parseInt(line.substring(line.indexOf('+')+1).trim());
        System.out.println(a);
        System.out.println(b);
        System.out.printf("suma yra %s", a+b);
    }
}
