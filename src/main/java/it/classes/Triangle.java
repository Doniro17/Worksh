package it.classes;

import it.exceptions.TriangleException;
import it.interfaces.IPolygon;

/**
 * triangle class
 *
 */
public class Triangle implements IPolygon {

    private double fstSegment;
    private double scndSegment;
    private double thrdSegment;

    private Triangle() {
    }
//
    /**desc
     * @param fstSegment first triangle segment
     * @param scndSegment second triangle segment
     * @param thrdSegment third triangle segment
     * @throws TriangleException own exception for triangle
     */
    public Triangle(final double fstSegment, final double scndSegment, final double thrdSegment) throws TriangleException {

        if (fstSegment + scndSegment <= thrdSegment) {
            throw new TriangleException("not a triangle");
        }
        this.fstSegment = fstSegment;
        this.scndSegment = scndSegment;
        this.thrdSegment = thrdSegment;
    }

    /**
     * calc perimetr of triangle
     * @return return statement
     */
    public double perimetr() {

        return fstSegment + scndSegment + thrdSegment;
    }

    /**
     * basic to string method
     * @return return statement
     */
    public String toString() {

        StringBuilder str = new StringBuilder();
        str.append(fstSegment + ", " + scndSegment + ", " + thrdSegment);
        return str.toString();
    }

}


