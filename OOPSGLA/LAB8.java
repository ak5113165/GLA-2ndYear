package OOPSGLA;

class Rectangle{
    float length;
    float width;
    float area;

    Rectangle(float l,float w)
    {
        length=l;
        width=w;
        area=l*w;
    }

}
class person{
    String name;
    int age;

    // Constructor
    person(String n,int a)
    {
        name=n;
        age=a;
    }
    public void setvalues(int a,String n)
    {
        name=n;
        age=a;
    }
    public void display()
    {
        System.out.println(name + " " + age);
    }
}
public class LAB8 {
    public static void main(String[] args) {
        //Write a Java program to create a class called "Person" with a name and age attribute
        //create a method to set their attributes.
//        person p1=new person();
//        p1.setvalues(23,"Kaustubh");
//        p1.display();
//        System.out.println(p1);

        person p2=new person("Devansh",18);
        p2.display();

        //Write a Java program to create a class called "Rectangle" with width and height attributes.
        // Calculate the area and perimeter of the rectangle.

        Rectangle r=new Rectangle(10.0,12.0);
//        Write a Java program to create class called "TrafficLight" with attributes for color and duration, and
//        methods to change the color and check for red or green.
    }
}
