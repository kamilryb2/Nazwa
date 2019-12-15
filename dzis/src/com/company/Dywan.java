package com.company;

public class Dywan {
    String color;
    double width;
    double length;

    public Dywan(String color) {
        this.color = color;
    }

    public Dywan(double width) {
        this.width = width;
    }

    public Dywan(String color, double width, double length) {
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public Dywan(String color, double width) {
        this.color = color;
        this.width = width;
    }

    public Dywan(double width, double length) {
        this.width = width;
        this.length = length;
    }
}
