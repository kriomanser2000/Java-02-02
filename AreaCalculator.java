public class AreaCalculator
{
    private static int calculationCount = 0;
    public static double triangleArea(double base, double height)
    {
        calculationCount++;
        return 0.5 * base * height;
    }
    public static double triangleArea(double a, double b, double c)
    {
        calculationCount++;
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public static double rectangleArea(double length, double width)
    {
        calculationCount++;
        return length * width;
    }
    public static double squareArea(double side)
    {
        calculationCount++;
        return side * side;
    }
    public static double rhombusArea(double d1, double d2)
    {
        calculationCount++;
        return 0.5 * d1 * d2;
    }
    public static int getCalculationCount()
    {
        return calculationCount;
    }
    public static void main(String[] args)
    {
        System.out.println("Площа трикутника (1/2 * основа * висота): " + triangleArea(5, 10));
        System.out.println("Площа трикутника (Герон): " + triangleArea(3, 4, 5));
        System.out.println("Площа прямокутника: " + rectangleArea(4, 5));
        System.out.println("Площа квадрата: " + squareArea(6));
        System.out.println("Площа ромба: " + rhombusArea(4, 5));
        System.out.println("Кількість підрахунків площ: " + getCalculationCount());
    }
}
