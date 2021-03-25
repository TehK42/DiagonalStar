package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        printSquareStar(2);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {

            // Loop denoting rows
            for (int i = 0; i < number; i++) {

                // Loop denoting columns
                for (int j = 0; j < number; j++) {

                    // Checking boundary conditions
                    // and main diagonal and
                    // secondary diagonal conditions
                    if (i == 0 || j == 0 || i == j
                            || i == number - 1 || j == number - 1
                            || i + j == number - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }

        }
    }
}
