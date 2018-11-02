package it;

import it.classes.Triangle;
import it.exceptions.TriangleException;
import it.classes.IPolygon;

/**
 * main class
 */
public final class Main {
    private Main() {
    }

    /**
     * @param args standart input
     */
    public static void main(final String[] args) {

        try {
            IPolygon triangle = new Triangle(4, 4, 6);
            System.out.println(triangle);
            System.out.print("Triangle perimeter: ");
            System.out.println(triangle.perimeter());
        } catch (TriangleException e) {
            System.out.println(e.getMessage());
        }


    }

}
