package lt.codeacademy.json.example;

import java.io.Serializable;

public class Box implements Serializable {
    private String name;
    private Size size;

    public Box(String name, Size size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
