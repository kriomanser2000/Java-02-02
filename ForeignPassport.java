public class ForeignPassport extends Passport
{
    private String foreignPassportNumber;
    private String[] visas;
    public ForeignPassport(String firstName, String lastName, String citizenship, String passportNumber,
                           String foreignPassportNumber, String[] visas)
    {
        super(firstName, lastName, citizenship, passportNumber);
        this.foreignPassportNumber = foreignPassportNumber;
        this.visas = visas;
    }
    public String getForeignPassportNumber()
    {
        return foreignPassportNumber;
    }
    public void setForeignPassportNumber(String foreignPassportNumber)
    {
        this.foreignPassportNumber = foreignPassportNumber;
    }
    public String[] getVisas()
    {
        return visas;
    }
    public void setVisas(String[] visas)
    {
        this.visas = visas;
    }
    public void displayForeignPassportInfo()
    {
        super.displayPassportInfo();
        System.out.println("Номер закордонного паспорта: " + foreignPassportNumber);
        System.out.println("Візи:");
        for (String visa : visas)
        {
            System.out.println(" - " + visa);
        }
    }
}
