package lesson21.exFactoryMethod.impl;

import lesson21.exFactoryMethod.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle has three right angles and two equal opposite sides.");
    }
}
