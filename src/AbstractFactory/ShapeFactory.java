package AbstractFactory;

import AbstractFactory.color.Color;
import AbstractFactory.color.Green;
import AbstractFactory.shape.Circle;
import AbstractFactory.shape.Rect;
import AbstractFactory.shape.Shape;

public class ShapeFactory implements AbstractFactory {


    @Override
    public Color getColor(String color) {
        return null;

    }

    @Override
    public Shape getShape(String shape) {
        if ("circle".equalsIgnoreCase(shape)) {
            return new Circle();
        } else {
            return new Rect();
        }
    }
}
