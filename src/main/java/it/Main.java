package it;

import it.classes.Triangle;
import it.exceptions.TriangleException;

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
            Triangle triangle = new Triangle(4, 4, 6);
            System.out.println(triangle.toString());
            triangle.perimeter();
        } catch (TriangleException e) {
            System.out.println(e.getMessage());
        }


    }

}
