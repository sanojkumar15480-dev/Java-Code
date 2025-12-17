class Shape
{
    double area()
    {
    return 0;
    }
}

class Circle extends Shape
{
    double radius;
    Circle(double radius)
    {
    this.radius = radius;
    }

    @Override
    double area()
        {
            return Math.PI * radius * radius;
        }
}

public class Main
{
    public static void main(String[] args)
    {
    double radius = 5.0;
    Circle circle = new Circle (radius);
    double circleArea = circle.area();
    System.out.println("Area of the circle with radius " + radius + "is: " +circleArea);  
    }
}
