package lesson21.exFactoryMethod.impl;

import lesson21.exFactoryMethod.Shape;

public class Cirlce implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle is set of points at a distance R from the center.");
    }
}
