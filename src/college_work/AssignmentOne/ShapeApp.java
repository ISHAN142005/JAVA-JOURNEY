package college_work.AssignmentOne;

abstract class Shape {
    abstract double calculateArea();

    abstract double calculatePerimeter();

    abstract String getName();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    String getName() {
        return "Circle";
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    @Override
    String getName() {
        return "Rectangle";
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    String getName() {
        return "Square";
    }
}

public class ShapeApp {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(12, 10),
                new Square(10),
                new Circle(3),
                new Rectangle(8, 6),
                new Square(5)
        };

        double maxArea = -1;
        double minPerimeter = Double.MAX_VALUE;
        String maxAreaShape = "";
        String minPerimShape = "";

        for (Shape s : shapes) {
            double area = s.calculateArea();
            double perimeter = s.calculatePerimeter();

            System.out.println(s.getName());
            System.out.printf("Area = %.2f\n", area);
            System.out.printf("Perimeter = %.2f\n", perimeter);

            if (area > maxArea) {
                maxArea = area;
                maxAreaShape = s.getName();
            }
            if (perimeter < minPerimeter) {
                minPerimeter = perimeter;
                minPerimShape = s.getName();
            }
        }
        System.out.println("Shape with maximum area: " + maxAreaShape);
        System.out.println("Shape with minimum perimeter: " + minPerimShape);
    }
}
