interface Printable 
{
void print();
}
interface Showable extends Printable
{
void show();
}
class Piku implements Showable
{
public void print()
{
System.out.println("Captain America: Hello Peter What are you doing ");
System.out.println("Peter: Hey! I am cool How are you ? Did YOu met to \"TS\" ?");
}
public void show()
{
System.out.println("Pikachu: Hello There this is me.");
System.out.println("Marvel: Hi There this is me.");
}

public static void main(String args[])
{
Piku obj = new Piku();

obj.print();

//obj.show();

}
}