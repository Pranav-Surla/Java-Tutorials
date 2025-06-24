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
    double set_length(){
        return this.length;
    }
    double set_breadth(){
        return this.breadth;
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
    }

}