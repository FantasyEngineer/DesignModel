package AbstractFactory;

import AbstractFactory.color.Color;
import AbstractFactory.shape.Shape;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape rect = shapeFactory.getShape("rect");
        rect.draw();


        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color red = colorFactory.getColor("red");
        red.draw();
    }
}
