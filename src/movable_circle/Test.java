package movable_circle;

import movable.Movable;
import movable.MovablePoint;

public class Test {
    public static void main(String[] args) {
        Movable movable = new MovablePoint(5, 6,7,8);
        /*
        movable.moveDown();
        movable.moveLeft();
        movable.moveUp();
        movable.moveRight();
        */
        System.out.println(movable);
        MovableCircle movable1 = new MovableCircle(5, 6, 7, 8, 9 );
        movable.moveLeft();
        System.out.println(movable1);
    }
}
