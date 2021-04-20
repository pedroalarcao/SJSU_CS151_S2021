/**
 *
 */

import java.util.ArrayList;

public class ShapeTest {
    public static void main(String[] args) {

        Shapes shapes = new Shapes(new ArrayList<Shape>());

        shapes.add(new Triangle(3,6));
        shapes.add(new Triangle(4,7));
        shapes.add(new Rectangle(100,1000));
        shapes.add(new Rectangle(4,8));
        shapes.add(new Hexagon(5));
        shapes.add(new Hexagon(10));
        shapes.add(new Circle(2));
        shapes.add(new Circle(4));

        shapes.max();
        shapes.min();

        Thread t1 = new Thread(() -> shapes.compute());

        Thread t2 = new Thread(() -> shapes.compute());

        t1.start();
        t2.start();



    }
}
