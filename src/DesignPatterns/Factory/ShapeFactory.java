package DesignPatterns.Factory;

public class ShapeFactory {
    public Shape getShape(String shapeType) {

        switch (shapeType) {

            case "SQUARE":
                return new Square();
            case "RECTANGLE":
                return new Rectangle();
            case "CIRCLE":
                return new Circle();
        }
        return null;
    }
}
