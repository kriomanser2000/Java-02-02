public class ShowExample implements IShow
{
    private String message;
    public ShowExample(String message)
    {
        this.message = message;
    }
    @Override
    public void Print()
    {
        System.out.println("Інформація: " + message);
    }
    @Override
    public void Print(String info)
    {
        System.out.println("Інформація: " + message + " | Додаткова інфа: " + info);
    }
    public static void main(String[] args)
    {
        ShowExample example = new ShowExample("ТЕСТ");
        example.Print();
        example.Print("Додаткова інфа");
    }
}
