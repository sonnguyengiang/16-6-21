package com.company;

public class Circle {
    private double radius;
    private String coler;
    public Circle(){

    }
    public Circle(double radius, String coler) {
        this.coler = coler;
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColer(){
        return this.coler;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColer(String coler) {
        this.coler = coler;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", coler='" + coler + '\'' +
                '}';
    }
}
