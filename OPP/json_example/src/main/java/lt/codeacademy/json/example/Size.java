package lt.codeacademy.json.example;

import java.io.Serializable;

public class Size implements Serializable {
    private int size;

    public Size(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
