package com.lxy.springcore.common.impl;

import com.lxy.springcore.common.Shape;

//矩形
public class Rectangle implements Shape {
    private final double height;
    private final double weight;

    public Rectangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double computeArea() {
        return height * weight;
    }

    public double computeSize() {
        return 2 * (height + weight);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", weight=" + weight +
                ", area=" + computeArea() +
                ", size=" + computeSize() +
                '}';
    }
}
