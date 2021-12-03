package com.gdstruct.module6;

public class Main {

    public static void main(String[] args) {
        int numbers[] = {25, 55, 67, 123, 567, 365, 100, 100, 200, 45, 37};

        System.out.println(apexSearch(numbers, 45));
    }

    public static int apexSearch(int[] input, int value) {
        // Checks for 0 and even index
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value) {
                return i;
            }

            i++;
        }

        // Checks for Odd indexes
        for (int i = 1; i < input.length; i++) {
            if (input[i] == value) {
                return i;
            }

            i++;
        }

        return -1;
    }
}
