package it.classes;

import it.exceptions.TriangleException;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {


    @Test
    public void perimeterTest() throws TriangleException {
        Triangle triangle = new Triangle(3, 2, 3);
        double actual = triangle.perimeter();
        double expected = 8.0;
        assertEquals(expected, actual, 1e-6);

    }

    @Test(expected = TriangleException.class)
    public void triangleExceptionTest() throws TriangleException {
        Triangle triangle = new Triangle(1, 2, 1);
    }

}