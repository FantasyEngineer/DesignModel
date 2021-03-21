package AbstractFactory;

import AbstractFactory.color.Color;
import AbstractFactory.color.Green;
import AbstractFactory.color.Red;
import AbstractFactory.shape.Circle;
import AbstractFactory.shape.Rect;
import AbstractFactory.shape.Shape;

public class ColorFactory implements AbstractFactory {
    @Override
    public Color getColor(String color) {
        if ("red".equalsIgnoreCase(color)) {
            return new Red();
        } else {
            return new Green();
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
