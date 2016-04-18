
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dhalt0019
 */
public class Four {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City a2q5 = new City();

        RobotSE Tina = new RobotSE(a2q5, 0, 2, Direction.SOUTH);
        RobotSE Karel = new RobotSE(a2q5, 0, 2, Direction.SOUTH);

        Tina.setLabel("T");
        Karel.setLabel("K");

        Tina.setColor(Color.blue);

        new Wall(a2q5, 1, 0, Direction.WEST);
        new Wall(a2q5, 2, 0, Direction.WEST);
        new Wall(a2q5, 3, 0, Direction.WEST);
        new Wall(a2q5, 4, 0, Direction.WEST);
        new Wall(a2q5, 5, 0, Direction.WEST);
        new Wall(a2q5, 6, 0, Direction.WEST);
        new Wall(a2q5, 7, 0, Direction.WEST);
        new Wall(a2q5, 8, 0, Direction.WEST);
        new Wall(a2q5, 9, 0, Direction.WEST);
        new Wall(a2q5, 0, 0, Direction.WEST);


        new Wall(a2q5, 0, 1, Direction.EAST);
        new Wall(a2q5, 1, 1, Direction.EAST);
        new Wall(a2q5, 2, 1, Direction.EAST);
        new Wall(a2q5, 3, 1, Direction.EAST);
        new Wall(a2q5, 4, 1, Direction.EAST);
        new Wall(a2q5, 5, 1, Direction.EAST);
        new Wall(a2q5, 6, 1, Direction.EAST);
        new Wall(a2q5, 7, 1, Direction.EAST);
        new Wall(a2q5, 8, 1, Direction.EAST);
        new Wall(a2q5, 9, 1, Direction.EAST);

        new Wall(a2q5, 0, 2, Direction.EAST);

        new Wall(a2q5, 1, 3, Direction.NORTH);
        new Wall(a2q5, 1, 4, Direction.NORTH);
        new Wall(a2q5, 1, 5, Direction.NORTH);
        new Wall(a2q5, 1, 6, Direction.NORTH);

        new Wall(a2q5, 1, 6, Direction.EAST);
        new Wall(a2q5, 2, 6, Direction.EAST);

        new Wall(a2q5, 2, 3, Direction.SOUTH);
        new Wall(a2q5, 2, 4, Direction.SOUTH);
        new Wall(a2q5, 2, 5, Direction.SOUTH);
        new Wall(a2q5, 2, 6, Direction.SOUTH);

        new Wall(a2q5, 3, 2, Direction.EAST);


        new Wall(a2q5, 4, 3, Direction.NORTH);
        new Wall(a2q5, 4, 4, Direction.NORTH);
        new Wall(a2q5, 4, 5, Direction.NORTH);


        new Wall(a2q5, 4, 3, Direction.SOUTH);
        new Wall(a2q5, 4, 4, Direction.SOUTH);
        new Wall(a2q5, 4, 5, Direction.SOUTH);
        new Wall(a2q5, 4, 5, Direction.EAST);

        new Wall(a2q5, 5, 2, Direction.EAST);
        new Wall(a2q5, 6, 2, Direction.EAST);

        new Wall(a2q5, 7, 3, Direction.NORTH);
        new Wall(a2q5, 7, 4, Direction.NORTH);
        new Wall(a2q5, 7, 5, Direction.NORTH);
        new Wall(a2q5, 7, 6, Direction.NORTH);
        new Wall(a2q5, 7, 7, Direction.NORTH);

        new Wall(a2q5, 7, 7, Direction.EAST);
        new Wall(a2q5, 8, 7, Direction.EAST);

        new Wall(a2q5, 8, 3, Direction.SOUTH);
        new Wall(a2q5, 8, 4, Direction.SOUTH);
        new Wall(a2q5, 8, 5, Direction.SOUTH);
        new Wall(a2q5, 8, 6, Direction.SOUTH);
        new Wall(a2q5, 8, 7, Direction.SOUTH);

        new Wall(a2q5, 9, 2, Direction.EAST);
        new Wall(a2q5, 9, 2, Direction.SOUTH);


        new Thing(a2q5, 0, 1);
        new Thing(a2q5, 1, 0);
        new Thing(a2q5, 2, 0);
        new Thing(a2q5, 3, 0);
        new Thing(a2q5, 3, 1);
        new Thing(a2q5, 4, 0);
        new Thing(a2q5, 7, 0);
        new Thing(a2q5, 9, 0);
        new Thing(a2q5, 9, 1);
        new Thing(a2q5, 8, 1);
        new Thing(a2q5, 7, 1);
        new Thing(a2q5, 5, 1);
        new Thing(a2q5, 1, 2);
        new Thing(a2q5, 2, 2);

        new Thing(a2q5, 4, 2);
        new Thing(a2q5, 7, 2);
        new Thing(a2q5, 0, 3);
        new Thing(a2q5, 1, 3);
        new Thing(a2q5, 4, 3);
        new Thing(a2q5, 7, 3);
        new Thing(a2q5, 8, 3);
        new Thing(a2q5, 9, 3);
        new Thing(a2q5, 0, 4);
        new Thing(a2q5, 1, 4);
        new Thing(a2q5, 2, 4);
        new Thing(a2q5, 3, 4);
        new Thing(a2q5, 4, 4);
        new Thing(a2q5, 6, 4);
        new Thing(a2q5, 8, 4);
        new Thing(a2q5, 9, 4);
        new Thing(a2q5, 1, 5);
        new Thing(a2q5, 5, 5);
        new Thing(a2q5, 0, 6);
        new Thing(a2q5, 2, 6);
        new Thing(a2q5, 3, 6);
        new Thing(a2q5, 4, 6);
        new Thing(a2q5, 6, 6);
        new Thing(a2q5, 8, 6);
        new Thing(a2q5, 9, 6);
        new Thing(a2q5, 1, 7);
        new Thing(a2q5, 4, 7);
        new Thing(a2q5, 5, 7);
        new Thing(a2q5, 7, 7);


        while (Tina.frontIsClear()) {

            Tina.move();
            Tina.turnLeft();



            if (Tina.canPickThing()) {

                Tina.pickThing();

            }

            while (!Tina.frontIsClear()) {

                Tina.turnRight();



                if (Tina.getStreet() == 9) {

                    break;

                }
            }
        }

        while (Karel.frontIsClear()) {

            Karel.move();

            while (Karel.canPickThing()) {

                Karel.pickThing();

            }

            if (!Karel.frontIsClear()) {

                break;
            }
        }
    }
}
