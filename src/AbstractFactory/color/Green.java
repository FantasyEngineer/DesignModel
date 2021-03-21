package AbstractFactory.color;

import AbstractFactory.shape.Shape;

public class Green implements Color {
    @Override
    public void draw() {
        System.out.println("Green-color");
    }
}
