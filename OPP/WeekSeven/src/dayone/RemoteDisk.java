package dayone;

import java.util.ArrayList;
import java.util.List;

public class RemoteDisk implements Storage{
    private final List<Info> infos;

    public RemoteDisk() {
        infos = new ArrayList<>();
    }

    @Override
    public void saveInfo(Info info) {
        infos.add(info);
        System.out.println("Info issaugotas nutolusiame diske");
    }

    @Override
    public Info findInfo(int Id) {
        for(Info info: infos){
            if(info.getId() == Id){
                System.out.println("Rasta info pagal id nutolusiame diske");
                return info;
            }
        }
        return null;
    }

    @Override
    public Info findInfo(String text) {
        for(Info info: infos){
            if(info.isInText(text)){
                System.out.println("Rasta info pagal teksta nutolusiame diske");
                return info;
            }
        }
        return null;
    }
}
