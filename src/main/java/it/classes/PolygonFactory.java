package it.classes;

import it.exceptions.TriangleException;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class PolygonFactory {

    /**
     * @param fstSegment  first triangle segment
     * @param scndSegment second triangle segment
     * @param thrdSegment third triangle segment
     * @return return statement
     * @throws TriangleException triangle invariance
     */
    public Triangle getTriangle(final double fstSegment, final double scndSegment, final double thrdSegment) throws TriangleException {

        return new Triangle(fstSegment, scndSegment, thrdSegment);
    }

    /**
     * @param fstSegment  first quadrangle segment
     * @param scndSegment second quadrangle segment
     * @param thrdSegment third quadrangle segment
     * @param frthSegment fourth quadrangle segment
     * @return return statement
     */
    public Quadrangle getQuadrangle(final double fstSegment, final double scndSegment, final double thrdSegment, final double frthSegment) {

        return new Quadrangle(fstSegment, scndSegment, thrdSegment, frthSegment);
    }

    /**
     * @param file polygons container
     * @return return statement
     * @throws IOException       input/output exception
     * @throws TriangleException triangle own exception
     */
    public List<IPolygon> getPolygonsFromFile(final File file) throws IOException, TriangleException {
        List<IPolygon> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))) {
            if (!reader.ready()) {
                throw new IOException("Файл пустой");
            }
            String line;
            List<String> segments = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                Collections.addAll(segments, line.split(" "));
                if (segments.size() == 3) {
                    list.add(new Triangle(Double.parseDouble(segments.get(0)),
                            Double.parseDouble(segments.get(1)),
                            Double.parseDouble(segments.get(2))));
                }
                if (segments.size() == 4) {
                    list.add(new Quadrangle(Double.parseDouble(segments.get(0)),
                            Double.parseDouble(segments.get(1)),
                            Double.parseDouble(segments.get(2)),
                            Double.parseDouble(segments.get(3))));
                }
                segments = new ArrayList<>();
            }
            if (list.size() == 0) {
                throw new IllegalArgumentException("No any polygons in file");
            }
            return list;
        }
    }
}

