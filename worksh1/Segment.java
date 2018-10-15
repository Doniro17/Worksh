package it.sevenbits.worksh1;

public class Segment {
    //double lenghtValue;
    Cell ax;
    Cell yx;

    public Segment(Cell ax, Cell yx) {
        this.ax = ax;
        this.yx = yx;
    }

    public double lengthCalc() {
        int l = ax.getX() - yx.getX();
        int h = ax.getY() - yx.getY();

        return Math.sqrt(Math.pow((ax.getX() - yx.getX()), 2)+Math.pow((ax.getY() - yx.getY()),2));
    }

}
