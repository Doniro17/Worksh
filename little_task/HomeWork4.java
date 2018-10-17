package it.sevenbits.little_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork4 {
    private static boolean arrayCheck(int[] arr) {
        return ((arr.length > 0) && (arr[0] == arr[arr.length - 1]));
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер массива и его элементы: ");
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println(arrayCheck(arr));

    }
}
