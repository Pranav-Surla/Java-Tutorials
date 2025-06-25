import java.util.Scanner;

abstract class Shape {
    abstract double calculate_area();
    abstract double calculate_perimeter();
}

class Circle extends Shape{
    private double radius = 0.0;
    
    Circle(double radius){
        
        if(radius < 0){
            System.out.println("We cannot create a circle with negative radius");
        }
        else{
            this.radius = radius;
            System.out.println("Circle of Radius " + this.radius + " is created.");
        }
        
    }

    void get_radius(){
        System.out.println("Radius = " + this.radius);
    }

    void set_radius(double radius){
        this.radius = radius;
        System.out.println("Radius Changed to " + this.radius);
    }

    @Override
    double calculate_perimeter(){
        return 2 * Math.PI * this.radius;
    }

    @Override
    double calculate_area(){
        return Math.PI * (this.radius * this.radius);
    }

}

class Rectangle extends Shape{
    private double length = 0.0 , breadth = 0.0;

    Rectangle(double length, double breadth){
        if (length < 0 || breadth < 0 ) {
            System.out.println("Rectangle cannot be created with negative sides");
        }
        else{
            this.length = length;
            this.breadth = breadth;
            System.out.println("Rectangle of length " + this.length + " and breadth " + this.breadth + " is created.");
        }
    }

    void get_length(){
        System.out.println("Length = " + this.length);
    }
    void get_breadth(){
        System.out.println("Breadth = " + this.breadth);
    }
    void set_length(){
        this.length = length;
        System.out.println("Length changed to " + this.length);
    }
    void set_breadth(){
        this.breadth = breadth;
        System.out.println("Breadth changed to " + this.breadth);
    }

    @Override
    double calculate_area() {
        return this.length * this.breadth;
    }

    @Override
    double calculate_perimeter() {
        return 2 * (this.length + this.breadth);
    }
}
class Square extends Shape{
    private double side = 0.0;
    
    Square(double side){
        
        if(side < 0){
            System.out.println("We cannot create a Square with negative side");
        }
        else{
            this.side = side;
            System.out.println("Square of Side " + this.side + " is created.");
        }
        
    }

    void get_side(){
        System.out.println("Radius = " + this.side);
    }

    void set_side(double side){
        this.side = side;
        System.out.println("Size Changed to " + this.side);
    }

    @Override
    double calculate_perimeter(){
        return 4 * this.side;
    }

    @Override
    double calculate_area(){
        return this.side * this.side;
    }

}
class Triangle extends Shape{
    private double base = 0.0 , height = 0.0,side1 = 0.0,side2 = 0.0,side3 = 0.0;

    Triangle(double base, double height,double side1,double side2,double side3){
        if (base < 0 || height < 0 ) {
            System.out.println("Triangle cannot be created with negative sides");
        }
        else{
            this.base = base;
            this.height = height;
            System.out.println("Triangle of base " + this.base + " and height " + this.height + " is created.");
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    void get_base(){
        System.out.println("Base = " + this.base);
    }
    void get_height(){
        System.out.println("Height = " + this.height);
    }
    void set_length(){
        this.base = base;
        System.out.println("Length changed to " + this.base);
    }
    void set_height(){
        this.height = height;
        System.out.println("Breadth changed to " + this.height);
    }

    @Override
    double calculate_area() {
        return 0.5 * (this.base * this.height);
    }

    @Override
    double calculate_perimeter() {
        return side1 + side2 + side3;
    }
}


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle c = new Circle(radius);
        double area = c.calculate_area();
        double perimeter = c.calculate_perimeter();
        System.out.println("Area of circle = " + area);
        System.out.println("Perimeter of circle = " + perimeter);
        
        System.out.print("Enter the length of the Rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the Rectangle: ");
        double breadth = scanner.nextDouble();


        Rectangle rectangle = new Rectangle(length, breadth);
        area = rectangle.calculate_area();

        perimeter = rectangle.calculate_perimeter();
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
        
        System.out.print("Enter the length of the the side: ");
        double side = scanner.nextDouble();
        Square square = new Square(side);
        area = square.calculate_area();
        perimeter = square.calculate_perimeter();
        System.out.println("Area of Square = " + area);
        System.out.println("Perimeter of Square = " + perimeter);

        System.out.print("Enter the length of 1st side: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the length of 2nd side: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the length of 3rd side: ");
        double side3 = scanner.nextDouble();
        System.out.print("Enter the base of Triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of Triangle: ");
        double height = scanner.nextDouble();
        
        Triangle triangle = new Triangle(base, height, side1, side2, side3);
        area = triangle.calculate_area();
        perimeter = triangle.calculate_perimeter();
        System.out.println("Area of Triangle = " + area);
        System.out.print("Perimeter of Triangle = " + perimeter);

    }

}