package it.classes;

import it.exceptions.TriangleException;

/**
 * triangle class
 * contains 3 variables for create an class object
 * public & private constructor
 * methot for perimetr calc
 * toString method impl
 */
public class Triangle implements IPolygon {

    private double fstSegment;
    private double scndSegment;
    private double thrdSegment;

    private Triangle() {
    }
//

    /**
     * public Triangle constructor
     *
     * @param fstSegment  first triangle segment
     * @param scndSegment second triangle segment
     * @param thrdSegment third triangle segment
     * @throws TriangleException own exception for triangle
     */
    public Triangle(final double fstSegment, final double scndSegment, final double thrdSegment) throws TriangleException {

        if ((fstSegment + scndSegment <= thrdSegment) ||
                (fstSegment + thrdSegment <= scndSegment) ||
                (thrdSegment + scndSegment <= fstSegment)) {
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
    public double perimeter() {

        return fstSegment + scndSegment + thrdSegment;
    }

    /**
     * String representation of instance triangle
     *
     * @return return statement
     */
    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();
        str
                .append("Triangle segments lengths ")
                .append(fstSegment)
                .append(", ")
                .append(scndSegment)
                .append(", ")
                .append(thrdSegment)
                .append(", ");
        return str.toString();
    }

}


