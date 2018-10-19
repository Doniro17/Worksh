package it.sevenbits.worksh1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static boolean pointOnTheLine(Segment seg, Cell dot) {
        Segment s1 = new Segment(seg.ax, dot);
        Segment s2 = new Segment(seg.yx, dot);
        return ((s1.lengthCalc() + s2.lengthCalc()) == seg.lengthCalc());

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final int maxValue = 10;
        double maxLength = -1;
        Random rand = new Random();
        System.out.println("Enter array length: ");
        Segment[] l = new Segment[Integer.parseInt(reader.readLine())];

        for (int i = 0; i < l.length; i++) {
            l[i] = new Segment(new Cell(rand.nextInt(maxValue), rand.nextInt(maxValue)),
                    new Cell(rand.nextInt(maxValue), rand.nextInt(maxValue)));
            System.out.println(l[i].lengthCalc());
            if (l[i].lengthCalc() > maxLength) maxLength = l[i].lengthCalc();
        }
        System.out.println("The longest segment is: " + maxLength);


    }

}
