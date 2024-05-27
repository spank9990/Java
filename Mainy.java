abstract class Vehicle {
    public abstract int getNoOfWheels();
}
class Bus extends Vehicle
{
    public int getNoOfWheels()
    {
        return 8;
    }
}
class Mainy
{
    public static void main (String[]args)
    {Bus b = new Bus ();
    int x =b.getNoOfWheels();
    System.out.print(x);
    }
}