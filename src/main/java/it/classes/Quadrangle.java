package it.classes;

import it.interfaces.IPolygon;

/**
 * class for qudrangle
 */
public final class Quadrangle implements IPolygon {

    private double fstSegment;
    private double scndSegment;
    private double thrdSegment;
    private double frthSegment;

    private Quadrangle() {
    }

    private Quadrangle(final double fstSegment, final double scndSegment, final double thrdSegment, final double frthSegment) {
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
