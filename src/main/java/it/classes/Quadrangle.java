package it.classes;

import it.interfaces.IPolygon;

/**
 * class for Quadrangle
 * contains 4 variables for create an class object
 * public & private constructor
 * methot for perimetr calc
 * toString method impl
 */
public final class Quadrangle implements IPolygon {

    private double fstSegment;
    private double scndSegment;
    private double thrdSegment;
    private double frthSegment;

    private Quadrangle() {
    }

    /**
     * public quadrangle constructor
     *
     * @param fstSegment  first quadrangle segment
     * @param scndSegment second quadrangle segment
     * @param thrdSegment third quadrangle segment
     * @param frthSegment fourth quadrangle segment
     */
    public Quadrangle(final double fstSegment, final double scndSegment, final double thrdSegment, final double frthSegment) {
        this.fstSegment = fstSegment;
        this.scndSegment = scndSegment;
        this.thrdSegment = thrdSegment;
        this.frthSegment = frthSegment;
    }

    /**
     * method for perimetr calc
     *
     * @return return statement
     */
    public double perimetr() {

        return frthSegment + scndSegment + thrdSegment + fstSegment;
    }
//

    /**
     * String representation of instance qudrangle
     *
     * @return return statement
     */
    public String toString() {

        StringBuilder str = new StringBuilder();
        str
                .append(fstSegment)
                .append(", ")
                .append(scndSegment)
                .append(", ")
                .append(thrdSegment)
                .append(", ")
                .append(frthSegment);
        return str.toString();
    }
}
