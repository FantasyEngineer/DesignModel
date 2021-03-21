package AbstractFactory;

import AbstractFactory.color.Color;
import AbstractFactory.shape.Shape;

public interface AbstractFactory {

    Color getColor(String color);

    Shape getShape(String shape);
}
