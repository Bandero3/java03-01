package daythree;

import daytwo.Tank;
import daytwo.TankPosition;

public class NewTaskTwo {
    public static void main(String[] args) {
        Object tank = new Tank();
        TaskOne tank2 = new TaskOne();


        System.out.println(tank==tank2);
        System.out.println(tank.equals(tank2));

        tank = tank2;
        System.out.println(tank==tank2);
        System.out.println(tank.equals(tank2));
    }
}
