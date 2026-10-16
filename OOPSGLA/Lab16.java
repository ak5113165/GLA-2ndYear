package OOPSGLA;

class Vehicle{
    Vehicle()
    {
        System.out.println("Vehicle class constructor");
    }
    public void drive()
    {
        System.out.println("Vechile is ecofriendly");
    }
}
class car extends Vehicle
{
    car()
    {
        System.out.println("Car class Constructor");
    }
    public void drive()
    {
        System.out.println("Car is ecofriendly");
    }
}
public class Lab16 {
    public static void main(String[] args) {

        car c1=new car();

    }
}
