package com.lxy.springcore.common.impl;

import com.lxy.springcore.common.Shape;

//圆形
public class Circular implements Shape {
    private final double radius;

    public Circular(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public double computeSize() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circular{" +
                "radius=" + radius +
                ", area=" + computeArea() +
                ", size=" + computeSize() +
                '}';
    }
}