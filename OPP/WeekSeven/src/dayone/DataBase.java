package dayone;

import java.util.HashMap;

public class DataBase implements Storage {
    private final HashMap <Integer, Info> infos;

    public DataBase() {
        infos= new HashMap<>();
    }

    @Override
    public void saveInfo(Info info) {
        infos.put(info.getId(),info);
        System.out.println("Issaugota duomenu bazeje");

    }

    @Override
    public Info findInfo(int Id) {
        System.out.println("Rasta pagal Id duomenu bazeje");
        return infos.get(Id);
    }

    @Override
    public Info findInfo(String text) {
        for(Integer key: infos.keySet()){
            Info info = infos.get(key);
            if(info.isInText(text)){
                System.out.println("Rasta pagal teksta duomenu bazeje");
                return info;
            }
        }

/*        for(Map.Entry<Integer, Info> entry : infos.entrySet()){
            if(entry.getValue().getText().equals(zodis));
            return entry.getValue();
        }*/

/*        for(Info info: infos.values()){
            if(info.getText().equals(text)){
                return info;
            }
        }*/
        return null;
    }
}
