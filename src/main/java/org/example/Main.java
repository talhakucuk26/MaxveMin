package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eleman Sayısını Giriniz n: ");
        int n = scanner.nextInt();
        int[] array = new int[n];


        System.out.println("Eleman Giriniz : ");
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". eleman: ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Sorted: " + Arrays.toString(array));

    }
}