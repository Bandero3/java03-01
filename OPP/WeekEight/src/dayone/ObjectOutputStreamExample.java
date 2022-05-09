package dayone;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) {

        try(ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("objectOutput.txt"))){
            ob.writeObject(new Person("Anton", 26));
            ob.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
