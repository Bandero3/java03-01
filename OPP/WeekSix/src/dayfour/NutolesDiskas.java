package dayfour;

import java.util.ArrayList;
import java.util.List;

public class NutolesDiskas implements Saugykla {
    List<Info> infoList = new ArrayList<>();

    @Override
    public void saugotiInfo(Info info) {
        infoList.add(info);
        System.out.println("Issaugo i nutolusi diska");
    }

    @Override
    public Info rastiInfo(int Id) {
        for (Info i : infoList) {
            if (i.getId() == Id) {
                System.out.println("Rasta nutolusiame diske pagal id");
                return i;
            }
        }
        System.out.println("Nerasta nutolusiame diske pagal id");
        return null;
    }

    @Override
    public Info rastiInfo(String zodis) {
        for (Info i : infoList) {
            if (i.getTekstas().contains(zodis)) {
                System.out.println("Rasta nutolusiame diske pagal zodi");
                return i;
            }
        }
        System.out.println("Nerasta nutolusiame diske pagal zodi");
        return null;
    }
}
