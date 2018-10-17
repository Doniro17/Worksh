package it.sevenbits.little_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork2 {

    private static String helloStringBuild(String s1) {

        String s = "Hello ";
        s += s1;
        return s;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(helloStringBuild(reader.readLine()));

    }

}
