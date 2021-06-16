package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height, radius;
        System.out.println("enter a height: ");
        height = scanner.nextDouble();
        System.out.println("enter a radius: ");
        radius = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(height,radius,"yellow");
	cylinder.show();
    }
}
