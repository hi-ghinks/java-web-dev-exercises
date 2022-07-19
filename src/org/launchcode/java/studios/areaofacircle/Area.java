package org.launchcode.java.studios.areaofacircle;
//1. Ask user for radius
//2. Calculate area
//3. Print out the result
import java.util.Scanner;

public class Area {
//starting point
    public static void main(String[] args) {
        Area area = new Area();
        area.calculateArea();
    }
    //declare variables


    //create constructor
    public Area() {

    }


    //create other methods
    public void calculateArea() {
        //Ask for radius
        Scanner input = new Scanner(System.in);
        Double userRadius = input.nextDouble();

        Double area = Circle.getArea(userRadius);
        System.out.println(area);
//close the scanner
//
input.close();

    }
}
