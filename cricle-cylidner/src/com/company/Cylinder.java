package com.company;

public class Cylinder extends Cricle{
    private double height;
    public Cylinder(){}
    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double thetich(){
        return super.area() * getHeight();
    }
    public void show(){
        System.out.println("the tich hinh tru la: " + thetich());
    }
    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}' + super.toString();
    }
}
