package com.company;

public class Cyliner extends Circle{
    private double height;
    public Cyliner(){

    }
    public Cyliner(double height) {
        this.height = height;
    }
        public Cyliner(double height,double radius, String coler){
        super(radius, coler);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double thetich(){
        return Math.PI * getRadius() * getRadius() * this.height;
    }
    public void show(){
        System.out.println("the tich la: " + thetich());
    }

    @Override
    public String toString() {
        return "Cyliner{" +
                "height=" + height +
                '}'+ super.toString();
    }
}

