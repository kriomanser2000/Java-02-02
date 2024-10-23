abstract class Worker
{
    abstract void Print();
}
class President extends Worker
{
    @Override
    void Print()
    {
        System.out.println("I am the President of the company.");
    }
}
class Security extends Worker
{
    @Override
    void Print()
    {
        System.out.println("I am responsible for the company's security.");
    }
}
class Manager extends Worker
{
    @Override
    void Print()
    {
        System.out.println("I am a Manager, managing teams and projects.");
    }
}
class Engineer extends Worker
{
    @Override
    void Print()
    {
        System.out.println("I am an Engineer, working on technical tasks.");
    }
}
