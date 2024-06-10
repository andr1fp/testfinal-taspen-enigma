package com.enigmacamp;

public class Main {

    public static void main(String[] args) {
        int size = 5;

        // Check if the size is an odd number
        if (size % 2 == 0) {
            System.out.println("The size must be an odd number.");
            return;
        }

        // Calculate the middle index
        int middle = size / 2;

        // Print the pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == middle || j == 0 || j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
}
