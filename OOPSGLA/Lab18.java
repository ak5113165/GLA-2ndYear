package OOPSGLA;
// Abstraction

abstract class TV{
    abstract void TVon();
    abstract void TVoff();
    TV()
    {
        System.out.println("this is a TV class");
    }
    public void display()
    {
        System.out.println("this is a TV class");
    }
}
class TVremote extends TV{

    TVremote()
    {
        super();
        System.out.println("This is a TV remote class");
    }
    void TVon()
    {
        System.out.println("Tv is on");
    }
    void TVoff()
    {
        System.out.println("TV is off");
    }
}
abstract class shape
{
    abstract double area();
    public void print()
    {
        System.out.println("this is a shape class");
    }
}
class circle extends shape{
    double radius;
    double area()
    {
        return 3.14*radius*radius;
    }
}

interface Animal{
    void sound();
}
class dog implements Animal{
    public void sound()
    {
        System.out.println("This is a dog class");
    }
}
public class Lab18 {

    public static void main(String[] args) {

        dog d1=new dog();
        d1.sound();

    }
}
