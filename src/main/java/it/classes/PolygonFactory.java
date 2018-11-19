package it.classes;

import it.exceptions.TriangleException;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PolygonFactory {

    public Triangle getTriangle (final double fstSegment, final double scndSegment, final double thrdSegment) throws TriangleException {

        return new Triangle(fstSegment, scndSegment, thrdSegment);
    }
    public Quadrangle getQuadrangle (final double fstSegment, final double scndSegment, final double thrdSegment, final double frthSegment) {

        return new Quadrangle(fstSegment, scndSegment, thrdSegment, frthSegment);
    }

    public IPolygon getPolygonsFromFile (File file) throws IOException {
        double fstSegment;
        double scndSegment;
        double thrdSegment;
        double frthSegment;
        List<IPolygon> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))) {
            if (!reader.ready()) {
                throw new IOException("Файл пустой");
            }
            String line;
            while ((line = reader.readLine()) != null) {
                for (String segment : line.split(" ")) {
                    
                }
            }
        }

    }

}
