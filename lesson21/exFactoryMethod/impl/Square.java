package lesson21.exFactoryMethod.impl;

import lesson21.exFactoryMethod.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square has three right angles and four equal sides.");
    }
}
