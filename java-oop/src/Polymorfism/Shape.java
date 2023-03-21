package Polymorfism;

public class Shape {

    public double getArea(){
        return 0;
    }
}


class Rectangle extends Shape {
       private double width;
       private double height;

       public Rectangle(double width, double height) {
           this.width = width;
           this.height = height;
       }
       public double getArea(){
           return width * height;
       }
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 3.14 * radius * radius;
    }
}

class ShapeTest {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
        shape[0] = new Circle(2);
        shape[1] = new Rectangle(2,4);

        System.out.println("Area of the Circle : " + shape[0].getArea());
        System.out.println("Area of the Circle : " + shape[1].getArea());
    }
}