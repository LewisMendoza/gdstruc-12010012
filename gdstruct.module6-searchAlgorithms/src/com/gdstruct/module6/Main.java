package com.gdstruct.module6;

public class Main {

    public static void main(String[] args) {
        int numbers[] = { -53, 12, 17, 33, 60, 64, 105 };

        /*System.out.println(linearSearch(numbers, 105));
        System.out.println(linearSearch(numbers, 420));*/
        System.out.println(binarySearch(numbers, 12));
        System.out.println(binarySearch(numbers, 69));
    }

    public static int linearSearch(int[] input, int value)
    {
        for (int i = 0; i < input.length; i++)
        {
            if (input[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] input, int value)
    {
        int start = 0;
        int end = input.length - 1;

        while (start <= end)
        {
            int middle = (start + end) / 2;

            if (input[middle] == value)
            {
                return middle;
            }

            else if (value < input[middle]) // Value might be at the left half
            {
                end = middle - 1;
            }

            else if (value > input[middle]) // value might be at the right half
            {
                start = middle + 1;
            }
        }

        return -1;
    }

    public static int lewiSearch(int[] input, int value)
    {
        return -1;
    }
}
