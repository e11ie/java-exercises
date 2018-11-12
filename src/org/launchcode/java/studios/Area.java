package org.launchcode.java.studios;

import java.util.Scanner;

// Area of a Circle (A = pi * r * r)
public class Area {
    public static void main(String args[]) {
        double pi = 3.14;
        double radius;
        double area;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        radius = in.nextDouble();
        area = pi * radius * radius;
        System.out.println("The area of a circle with radius " + radius + " is: " + area);
    }
}
