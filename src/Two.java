
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dhalt0019
 */
public class Two {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City kw = new City();

        RobotSE T = new RobotSE(kw, 2, 1, Direction.EAST);

        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.WEST);
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.WEST);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.WEST);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 6, Direction.SOUTH);
        new Wall(kw, 2, 7, Direction.SOUTH);
        new Wall(kw, 2, 8, Direction.WEST);
        new Wall(kw, 2, 8, Direction.SOUTH);
        new Wall(kw, 2, 9, Direction.SOUTH);

        new Thing(kw, 2, 9);

        while (!T.frontIsClear()) {
            T.turnLeft();
            T.move();
            T.turnRight();
            T.move();
            T.turnRight();
            T.move();
            T.turnLeft();

            while (T.frontIsClear()) {

                T.move();


                if (T.canPickThing()) {

                    T.pickThing();
                    break;

                }

            }
        }
    }
}