package dayfour;

import java.util.HashMap;

public class DuomenuBaze implements Saugykla {
    HashMap<Integer, Info> map = new HashMap<>();


    @Override
    public void saugotiInfo(Info info) {
        map.put(info.getId(), info);
        System.out.println("Issaugota i duomenu baze");
    }

    @Override
    public Info rastiInfo(int Id) {
        if (map.get(Id) != null) {
            System.out.println("Rasta duomenu bazeje");
            return map.get(Id);
        }
        System.out.println("Nerasta duomenu bazeje");
        return null;
    }

    @Override
    public Info rastiInfo(String zodis) {
        for (Integer key : map.keySet()) {
            if (map.get(key).getTekstas().contains(zodis)) {
                System.out.println("Rasta duomenu bazeje pagal zodi");
                return map.get(key);
            }
        }
        System.out.println("Nerasta duomenu bazeje pagal zodi");
        return null;
    }
}
