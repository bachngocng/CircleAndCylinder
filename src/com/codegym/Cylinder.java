package com.codegym;

public class Cylinder extends Circle {
    public double height;

    public Cylinder(){
        this.height = 0;
    }

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getVolume(){
        return super.getArea() * height;
    }

    @Override
    public String toString(){
        return "Cylinder{" +
                "radius=" + super.getRadius()+
                ", color=" + '\'' + super.getColor() + '\''+
                ", height=" + height +
                '}';
    }


}
