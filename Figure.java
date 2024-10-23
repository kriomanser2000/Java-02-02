abstract class Figure
{
    abstract double area();
}
class Rectangle extends Figure
{
    private double height;
    private double width;
    public Rectangle(double height, double width)
    {
        this.height = height;
        this.width = width;
    }
    @Override
    double area()
    {
        return height * width;
    }
}
class Circle extends Figure
{
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }
    @Override
    double area()
    {
        return Math.PI * radius * radius;
    }
}
class RectangularTriangle extends Figure
{
    private double foundation;
    private double width;

    public RectangularTriangle(double foundation, double width)
    {
        this.foundation = foundation;
        this.width = width;
    }
    @Override
    double area()
    {
        return (foundation * width) / 2;
    }
}
class Trapezoid extends Figure
{
    private double foundation1;
    private double foundation2;
    private double width;

    public Trapezoid(double foundation1, double foundation2, double width)
    {
        this.foundation1 = foundation1;
        this.foundation2 = foundation2;
        this.width = width;
    }
    @Override
    double area()
    {
        return ((foundation1 + foundation2) * width) / 2;
    }
}
