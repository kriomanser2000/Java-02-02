public class Human1
{
    private String name;
    private int age;
    private String gender;
    public Human1(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getGender()
    {
        return gender;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}
class Builder1 extends Human1
{
    private String company;
    public Builder1(String name, int age, String gender, String company)
    {
        super(name, age, gender);
        this.company = company;
    }
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Company: " + company);
    }
    public void buildHouse()
    {
        System.out.println(getName() + " is building a house.");
    }
}
class Sailor1 extends Human1
{
    private String shipName;
    public Sailor1(String name, int age, String gender, String shipName)
    {
        super(name, age, gender);
        this.shipName = shipName;
    }
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Ship Name: " + shipName);
    }
    public void sail()
    {
        System.out.println(getName() + " is sailing on the ship " + shipName + ".");
    }
}
class Pilot1 extends Human1
{
    private String aircraftType;
    public Pilot1(String name, int age, String gender, String aircraftType)
    {
        super(name, age, gender);
        this.aircraftType = aircraftType;
    }
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Aircraft Type: " + aircraftType);
    }
    public void fly()
    {
        System.out.println(getName() + " is flying an " + aircraftType + ".");
    }
}
