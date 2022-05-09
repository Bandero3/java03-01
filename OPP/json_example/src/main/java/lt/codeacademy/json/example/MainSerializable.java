package lt.codeacademy.json.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainSerializable {
    public static void main(String[] args) {
        try(ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("box.txt"))){
            ob.writeObject(new Box("small",new Size(25)));
            ob.writeObject(new Box("bix",new Size(75)));
            ob.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
