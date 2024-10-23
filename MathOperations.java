public class MathOperations
{
    public static int max(int a, int b, int c, int d)
    {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }
    public static int min(int a, int b, int c, int d)
    {
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
    public static double average(int a, int b, int c, int d)
    {
        return (a + b + c + d) / 4.0;
    }
    public static long factorial(int n)
    {
        if (n < 0)
        {
            throw new IllegalArgumentException("Факторіал не визначено для від'ємних чисел.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++)
        {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args)
    {
        int a = 4, b = 10, c = 6, d = 8;
        System.out.println("Максимум: " + max(a, b, c, d));
        System.out.println("Мінімум: " + min(a, b, c, d));
        System.out.println("Середнє арифметичне: " + average(a, b, c, d));
        System.out.println("Факторіал числа 5: " + factorial(5));
    }
}
