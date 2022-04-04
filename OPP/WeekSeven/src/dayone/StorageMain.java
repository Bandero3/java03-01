package dayone;

public class StorageMain {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        RemoteDisk remoteDisk = new RemoteDisk();

        Info info = new Info(1, "Simple text");
        Info info1 = new Info(2, "Kazkas");
        Info info2 = new Info(3, "dummy");
        Info info3 = new Info(4, "text");

        save(dataBase, info);
        save(dataBase, info1);
        findInfo(dataBase,2);
        save(remoteDisk, info2);
        save(remoteDisk, info3);
        findInfo(remoteDisk, "text");

    }

    private static void save(Storage storage, Info info){
        storage.saveInfo(info);
    }

    private static void findInfo(Storage storage, int id){
        Info info = storage.findInfo(id);
        System.out.println(info);
    }

    private static void findInfo(Storage storage, String text){
        Info info = storage.findInfo(text);
        System.out.println(info);
    }
}
