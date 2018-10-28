package it.classes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadrangleTest {

    @Test
    public void perimeterTest() {
        Quadrangle quadrangle = new Quadrangle(3, 2, 3, 4);
        double actual = quadrangle.perimeter();
        double expected = 12.0;
        assertEquals(expected, actual, 0.0);

    }
}