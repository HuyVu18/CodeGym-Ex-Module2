package lesson21.exFactoryMethod;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("radius");
        System.out.println("Shape 1 is:");
        shape.draw();

        shape = shapeFactory.getShape("two sides");
        System.out.println("Shape 2 is:");
        shape.draw();

        shape = shapeFactory.getShape("one side");
        System.out.println("Shape 3 is:");
        shape.draw();
    }
}
