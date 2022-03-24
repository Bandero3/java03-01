package daytwo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Tank {
    private int x;
    private int y;
    private TankPosition position;
    private int shootEastCount;
    private int shootWestCount;
    private int shootSouthCount;
    private int shootNorthCount;

    public Tank(){
        x = 0;
        y = 0;
        shootEastCount = 0;
        shootWestCount = 0;
        shootSouthCount = 0;
        shootNorthCount = 0;
    }


    public void pirmyn(){
        y++;
        position = TankPosition.NORTH;
        moveInfo();
    }
    public void atgal(){
        y--;
        position = TankPosition.SOUTH;
        moveInfo();
    }
    public void kairen(){
        x--;
        position = TankPosition.WEST;
        moveInfo();
    }
    public void desinen(){
        x++;
        position = TankPosition.EAST;
        moveInfo();
    }
    public void suvis(){
        switch(position){
            case EAST -> shootEastCount++;
            case WEST -> shootWestCount++;
            case SOUTH -> shootSouthCount++;
            case NORTH -> shootNorthCount++;
        }
        System.out.printf("Suvis i %s\n", position);

    }
    public void info(){
        int sum = shootEastCount + shootWestCount + shootSouthCount + shootNorthCount;
        System.out.printf("INFO: Tanko kordinates: (%d;%d), krypris %s\n", x, y, position);
        System.out.printf("INFO: Tanko suviai: %d i Siaure: %d i Rytus, %d i Pietus, %d i Vakarus. Is viso suviu: %d", shootNorthCount, shootEastCount, shootWestCount, shootSouthCount, sum);
    }

    private void moveInfo(){
        LocalTime time = LocalTime.now();
        System.out.printf("[%s] Tankas juda i %s kordinates(%d;%d)\n", time.format(DateTimeFormatter.ofPattern("HH:mm")), position, x,y);
    }
}

