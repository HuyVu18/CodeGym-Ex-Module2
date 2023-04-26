package lesson21.exFactoryMethod;

import lesson21.exFactoryMethod.impl.Cirlce;
import lesson21.exFactoryMethod.impl.Rectangle;
import lesson21.exFactoryMethod.impl.Square;

public class ShapeFactory {
    public Shape getShape(String core) {
        if ("radius".equals(core)) return new Cirlce();
        else if ("one side".equals(core)) return new Square();
        else return new Rectangle();
    }
}
