package daytwo;

public class IncorrectUserInputRuntimeException extends RuntimeException{

    private final int age;
    public IncorrectUserInputRuntimeException(String message, int age) {
        super(message);
        this.age = age;
    }


    public int getAge(){
        return age;
    }
}
