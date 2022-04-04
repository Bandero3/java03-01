package dayone;

public interface Storage {
    void saveInfo(Info info);

    Info findInfo(int Id);

    Info findInfo(String text);
}

