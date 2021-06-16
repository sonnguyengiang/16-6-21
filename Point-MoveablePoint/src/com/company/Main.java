package com.company;

public class Main {

    public static void main(String[] args) {
	Point point1 = new Point(2,5);
        System.out.println(point1.toString());
    MoveablePoint point2 = new MoveablePoint(2,5,7,9);
    point2.move();
        System.out.println(point2.toString());
    }
}
