package it.sevenbits.little_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork3 {

    private static int numberMod(int n) {
        if (n >= 0) return n * 2;
        else return -n;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(numberMod(Integer.parseInt(reader.readLine())));

    }
}
