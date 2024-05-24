package com.pluralsight;

import java.awt.*;
import java.util.Scanner;

public class MainApp {
    static Scanner userInput = new Scanner(System.in);

    //Home Screen
    public static void HomeScreen() {

        while (true) {

            System.out.println("""
                    ----------------------------------
                     TechTurtleWorld Drawing
                     1) Add Shape
                     2) Save Image
                     0) Exit
                    ----------------------------------
                    """);
            System.out.print("Enter a option: ");
            int option = userInput.nextInt();

            if (option == 1) {
                System.out.print("Which shape? 1. Square 2. Rectangle 3. Triangle");
                int choice = userInput.nextInt();

                switch (choice) {
                    case 1:
                        MainApp.main();

                    case 2:
                        MainApp.rectangle();

                    case  3:
                        MainApp.Triangle();
                }

                } else if (option == 2) {
                    //   Save Image

                } else if (option == 0) {
                    System.exit(0);

                } else {
                    System.out.println("Error!");
                }

            }
        }

    private static void Triangle() {

        System.out.print("What is the border width?: ");
        int width = userInput.nextInt();

        World world = new World(500, 500);
        Turtle turtle = new Turtle(world, 100, 100);

        // Define the side length of the triangle
        int sideLength = 100;
        int longSide = 130;
        int baseLine = 100;

// Move turtle to the starting position
        turtle.penUp();
        turtle.goTo(30, 30); // Center the square in the 200x200 world
        turtle.penDown();

        turtle.setPenWidth(width);
        turtle.setColor(Color.RED);

// Draw the triangle
        for (int i = 0; i < 1; i++) {
            turtle.forward(longSide);
            turtle.turnLeft(135);
            turtle.forward(sideLength);
            turtle.turnLeft(90);
            turtle.forward(baseLine);
            turtle.turnLeft(135);
        }
    }

    private static void rectangle() {
        System.out.print("What is the border width?: ");
        int width = userInput.nextInt();

        World world = new World(500, 500);
        Turtle turtle = new Turtle(world, 100, 100);

        // Define the side length of the rectangle
        int sideLength = 100;
        int longSide = 200;

// Move turtle to the starting position
        turtle.penUp();
        turtle.goTo(30, 30); // Center the square in the 200x200 world
        turtle.penDown();

        turtle.setPenWidth(width);
        turtle.setColor(Color.BLUE);

// Draw the rectangle
        for (int i = 0; i < 2; i++) {
            turtle.forward(longSide);
            turtle.turnRight(90);
            turtle.forward(sideLength);
            turtle.turnRight(90);
        }
    }

    public static void main() {

            // This starter code to get you familiar with how
            // the TurtleLogo application works
            System.out.print("What is the border width?: ");
            int width = userInput.nextInt();
            //  System.out.print("What is the border color: " + turtle.getColor());
            // String color = userInput.nextLine();


            //   int num = userInput.nextInt();
            // The world is your canvas

            World world = new World(500, 500);
            Turtle turtle = new Turtle(world, 100, 100);

            // Define the side length of the square
            int sideLength = 100;

// Move turtle to the starting position
            turtle.penUp();
            turtle.goTo(30, 30); // Center the square in the 200x200 world
            turtle.penDown();

            turtle.setPenWidth(width);
            turtle.setColor(Color.GREEN);

// Draw the square
            for (int i = 0; i < 4; i++) {
                turtle.forward(sideLength);
                turtle.turnRight(90);
            }

        }
    }



