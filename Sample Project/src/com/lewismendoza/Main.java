package com.lewismendoza;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // prints out Hello world
        //System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        // This is a change!!!!!
    }
}