// Базовый класс Shape
abstract class Shape {
    public abstract double getArea();
}

// Подкласс Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

// Подкласс Square
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

// Пример использования
public class Main {
    public static void printArea(Shape shape) {
        System.out.println("Площадь фигуры: " + shape.getArea());
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Square(7);

        printArea(rectangle); // Площадь фигуры: 50.0
        printArea(square);    // Площадь фигуры: 49.0
    }
}
