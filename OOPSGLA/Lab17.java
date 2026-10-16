//package OOPSGLA;
//
//class person{
//    String name;
//    person()
//    {
//        System.out.println("This is a person class");
//    }
//    public void display()
//    {
//        System.out.println("this is a person class");
//    }
//}
//class student extends person{
//    student()
//    {
//        super();
//        System.out.println("this is student class");
//    }
//    public void display()
//    {
//        System.out.println("This is a student class" + super.name);
//    }
//    public void print()
//    {
//        display();
//    }
//}
//
//class Animal{
//    String type;
//    boolean istail;
//    Animal(String type,boolean istail)
//    {
//        this.type=type;
//        this.istail=istail;
//        System.out.println("this is a ANimal class");
//    }
//    Animal(String type)
//    {
//        this.type=type;
//        System.out.println("This is ANimal class with one para constructor");
//    }
//}
//class dog extends Animal{
//    String breed;
//    dog(String type,boolean istail,String breed)
//    {
//        super(type,istail);
//        this.breed=breed;
//        System.out.println("this is a dog class");
//    }
//}
//public class Lab17 {
//    public static void main(String[] args) {
//
//        dog d1=new dog("Mamal",true);
//
//        Animal A1=new dog();
//    }
//}
