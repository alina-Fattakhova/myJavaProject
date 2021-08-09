package school.lesson1;


public interface Shape {
    double PI = 3.14;

    double perimetr();
    double ploschad();
    void info();
}

class Rectangle implements Shape {
    int side1;
    int side2;
    String borderColor = "blue";
    String bodyColor = "violet";

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double perimetr() {
        return (side1 + side2) * 2;
    }

    @Override
    public double ploschad() {
        return side1 * side2;
    }

    @Override
    public void info() {
        System.out.println("Perimetr = " + perimetr() + ", ploschad = " + ploschad() +
                ", borderColor = " + borderColor + ", bodyColor = " + bodyColor);
    }
}

class Circle implements Shape {
    int radius;
    String borderColor = "red";
    String bodyColor = "pink";

    public Circle(int radius) {
        this.radius = radius;
    }

    public double perimetr() {
        return 2 * PI * radius;
    }

    public double ploschad() {
        return PI * radius * radius;
    }

    @Override
    public void info() {
        System.out.println("Perimetr = " + perimetr() + ", ploschad = " + ploschad() +
                ", borderColor = " + borderColor + ", bodyColor = " + bodyColor);
    }
}



class Triangle implements Shape {
    //треугольник равнобедренный!
    int side;
    int bottomLine;
    int height;
    String borderColor = "green";
    String bodyColor = "yellow";

    public Triangle(int side, int bottomLine, int height) {
        this.side = side;
        this.bottomLine = bottomLine;
        this.height = height;
    }

    @Override
    public double perimetr() {
        return side * 2 + bottomLine;
    }

    @Override
    public double ploschad() {
        return 0.5 * bottomLine * height;
    }

    @Override
    public void info() {
        System.out.println("Perimetr = " + perimetr() + ", ploschad = " + ploschad() +
                ", borderColor = " + borderColor + ", bodyColor = " + bodyColor);
    }
}

class ShapeTest{
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(6, 9);
        rectangle.info();
        Shape triangle = new Triangle(6, 9, 5);
        triangle.info();
        Shape circle = new Circle( 9);
        circle.info();
    }
}