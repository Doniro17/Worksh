package it.classes;

import it.exceptions.TriangleException;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PolygonFactoryTest {
    private static PolygonFactory factory;

    @BeforeClass
    public static void getFileParser() {
        factory = new PolygonFactory();

    }

    @Test
    public void getTriangle() throws TriangleException {
        IPolygon triangle = new Triangle(2, 5, 6);
        assertEquals(triangle.getClass(), factory.getTriangle(1, 3, 3).getClass());

    }

    @Test
    public void getQuadrangle() {
        IPolygon quadrangle = new Quadrangle(2, 5, 6, 2);
        assertEquals(quadrangle.getClass(), factory.getQuadrangle(1, 2, 3, 4).getClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void noPolygonsTest() throws IOException, TriangleException {
        List<IPolygon> list = new ArrayList<>();
        list = factory.getPolygonsFromFile(new File("src/test/resources/file"));

    }

    @Test
    public void returnPolygonsTest() throws IOException, TriangleException {
        List<IPolygon> list = new ArrayList<>();
        list = factory.getPolygonsFromFile(new File("src/test/resources/polygons"));
        IPolygon triangle = new Triangle(2, 5, 6);
        IPolygon quadrangle = new Quadrangle(2, 5, 6, 2);
        assertEquals(Triangle.class,list.get(0).getClass());
        assertEquals(quadrangle.getClass(), list.get(1).getClass());
        assertEquals(triangle.getClass(), list.get(2).getClass());


    }

}