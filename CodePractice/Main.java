class Shape {
    public void draw(){
        System.out.println("Drawing a shape ");
    }
    public double  area(){
        return 0;
    }

    public void draw(String color){
        System.out.println("Drawing a shape with color " + color);
    }
}


class Circle extends Shape{
    double radius;

    public  Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }

    @Override 
    public void draw(String color){
        System.out.println("Drawing a circle with color " + color);
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    double length, width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a rectangle");
    }

    @Override
    public void draw(String color){
        System.out.println("Drawing a rectangle with color " + color);
    }

    @Override
    public double area(){
        return length * width;
    }
}

public class Main{
public static void main(String[] args){
    Shape genericShape = new Shape();
    Circle circle = new Circle(5);
    Rectangle rectangle = new Rectangle(5.0, 3.0);

    genericShape.draw();
    genericShape.draw("blue");
    genericShape.area();
        System.out.println("");
    circle.draw();
    circle.draw("Red");
    circle.area();
        System.out.println("");
    rectangle.draw();
    rectangle.draw("Black");
    rectangle.area();
    }
}
