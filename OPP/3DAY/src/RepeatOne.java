public class RepeatOne {

    double price = 99.99;
    int count = 0;

    public static void main(String[] args) {
        RepeatOne repeatOne = new RepeatOne();
//        System.out.println(repeatOne.price);
        printPrice(repeatOne.price);
        System.out.printf("Pries %s\n",repeatOne.count);
        repeatOne.increaseCount();
        System.out.printf("Po %s\n",repeatOne.count);
        repeatOne.increaseCustomCount(3);
        NewClass.printName("Anton");
        NewClass newClass = new NewClass();
        newClass.printAge(5);

    }
    public static void printPrice(double price){
        System.out.println(price);

    }
    public void increaseCount(){
        count++;

    }
    public void increaseCustomCount(int countIncrease){
        System.out.println(count+=countIncrease);
    }
}
