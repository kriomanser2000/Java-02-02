public class Passport
{
    private String firstName;
    private String lastName;
    private String citizenship;
    private String passportNumber;
    public Passport(String firstName, String lastName, String citizenship, String passportNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.citizenship = citizenship;
        this.passportNumber = passportNumber;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getCitizenship()
    {
        return citizenship;
    }
    public void setCitizenship(String citizenship)
    {
        this.citizenship = citizenship;
    }
    public String getPassportNumber()
    {
        return passportNumber;
    }
    public void setPassportNumber(String passportNumber)
    {
        this.passportNumber = passportNumber;
    }
    public void displayPassportInfo()
    {
        System.out.println("Ім'я: " + firstName);
        System.out.println("Прізвище: " + lastName);
        System.out.println("Громадянство: " + citizenship);
        System.out.println("Номер паспорта: " + passportNumber);
    }
}
