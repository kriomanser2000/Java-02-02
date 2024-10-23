public class Array implements IShow
{
    private int[] elements;
    public Array(int[] elements)
    {
        this.elements = elements;
    }
    @Override
    public void Print()
    {
        System.out.print("Елементи масиву: ");
        for (int element : elements)
        {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    @Override
    public void Print(String info)
    {
        Print();
        System.out.println("Додаткова інфа: " + info);
    }
    public static void main(String[] args)
    {
        int[] sampleArray = {1, 2, 3, 4, 5};
        Array arrayInstance = new Array(sampleArray);
        arrayInstance.Print();
        arrayInstance.Print("Цей масив містить 5 елементів.");
    }
}
