package daytwo;

import java.util.Comparator;
import java.util.Map;

public class PersonTeacher {
    private final int id;
    private final String name;
    private final String surname;
    private int receivedMoney;
    private int sentMoney;
    private int countSendMoney;
    private int countReceiveMoney;

    public PersonTeacher(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        receivedMoney = 0;
        sentMoney = 0;
        countSendMoney = 0;
        countReceiveMoney = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getReceivedMoney() {
        return receivedMoney;
    }

    public void setReceivedMoney(int receivedMoney) {
        countReceiveMoney++;
        this.receivedMoney = receivedMoney;
    }

    public int getSentMoney() {
        return sentMoney;
    }

    public void setSentMoney(int sentMoney) {
        countSendMoney++;
        this.sentMoney = sentMoney;
    }

    public int getCountSendMoney() {
        return countSendMoney;
    }

    public int getCountReceiveMoney() {
        return countReceiveMoney;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(",").append(name).append(",").append(surname).append(",").append(receivedMoney).append(",").append(sentMoney);
        return sb.toString();
    }

    public static final Comparator<PersonTeacher> SORT_BY_RECEIVED_MONEY_DEC = (o1, o2) -> {
        int money1 = o1.getReceivedMoney();
        int money2 = o2.getReceivedMoney();

        return Integer.compare(money2, money1);

/*        if(money1 > money2){
            return 1;
        }
        if(money1 < money2){
            return -1;
        }
        return 0;*/

    };

    public static final Comparator<PersonTeacher> SORT_BY_SEND_MONEY_ASC = (o1, o2) -> {
        return Integer.compare(o1.getSentMoney(), o2.getSentMoney());

    };

    public static final Comparator<PersonTeacher> SORT_BY_RECEIVED_MONEY_COUNT = (o1, o2) ->Integer.compare(o2.getCountReceiveMoney(),o1.getCountReceiveMoney());
}
