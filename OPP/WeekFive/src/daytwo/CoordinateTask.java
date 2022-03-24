package daytwo;

import java.util.ArrayList;
import java.util.List;

public class CoordinateTask {
    public static void main(String[] args) {
        List<Coordinate> coordinates = new ArrayList<>();
        coordinates.add(new Coordinate(2,5));
        coordinates.add(new Coordinate(1,5));
        coordinates.add(new Coordinate(5,9));
        coordinates.add(new Coordinate(4,0));
        coordinates.add(new Coordinate(0,0));
        coordinates.add(new Coordinate(9,1));

        System.out.println(coordinates);

        CoordinateTask task = new CoordinateTask();
        Coordinate coordinate = task.findCoordinate(0,0,coordinates);

        if(coordinate == null){
            System.out.println("Tokios kordinates nera");
            return;
        }

        System.out.printf("kordinate yra sarase %d\n", coordinates.indexOf(coordinate));
        coordinate.setX(1);
        coordinate.setY(1);

        System.out.println(coordinates);

    }

    private Coordinate findCoordinate(int x, int y, List<Coordinate> coordinates){
        for (Coordinate c: coordinates){
            if(c.getX() == x && c.getY() == y){
                return c;
            }
        }
        return null;
    }
}
