
interface Animal{
public void eat();
public void travel();
}
public class Mammallnt implements Animal
{
    public void eat()
    {
        System.out.println("Mammal Eats");
    }
    public void travel()
{
        System.out.println("Mammal Travels");
    }
    public int noOfLegs()
{
        return 0;
    }
    public static void main(String args[])
{
        Mammallnt m = new Mammallnt();
        m.eat();
        m.travel();
    }
}