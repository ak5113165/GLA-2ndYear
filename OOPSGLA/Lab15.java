//package OOPSGLA;
////encapsulation
//
//class person1{
//
//    private int age;
//    private String name;
//
//    person1(int age,String name)
//    {
//        this.name=name;
//        this.age=age;
//    }
//    public void display()
//    {
//        System.out.println(name + " " + age);
//    }
//    public void setName(String name)
//    {
//        this.name=name;
//    }
//    public String getName()
//    {
//        return name;
//    }
//
//}
////inheritance
//
////class Animal
////{
////    public void eat()
////    {
////        System.out.println("Animal is eating");
////    }
////}
////class dog extends Animal
////{
////    public void bark()
////    {
////        System.out.println("Dog is barking");
////    }
////}
////class cat extends Animal
////{
////    public void meow()
////    {
////        System.out.println("Cat is meow");
////    }
////}
////
//class parent{
//    String eyecolor;
//    public void display()
//    {
//        System.out.println(eyecolor);
//    }
//}
//class child extends parent
//{
//    String name;
//}
////
//class Grandfather
//{
//    public void intelligent()
//    {
//        System.out.println("he is very in0telligent");
//    }
//}
//class father extends Grandfather
//{
//    public void sportsman()
//    {
//        System.out.println("he is very athletic");
//    }
//}
//class son extends father
//{
//    public void singer()
//    {
//        System.out.println("he is very good singer");
//    }
//}
////
//class Animal{
//      public void sleep()
//      {
//          System.out.println("Animal is sleeping");
//      }
//}
//class dog extends Animal
//{
//    public void bark()
//    {
//        System.out.println("Dog is barking");
//    }
//}
//class cat extends Animal
//{
//    public void meow()
//    {
//        System.out.println("Cat is meowing");
//    }
//}
//
//class A{
//    void print()
//    {
//        System.out.println("hello world form class A");
//    }
//}
//class B{
//    void print()
//    {
//        System.out.println("hello from class B");
//
//    }
//}
//class C extends A,B{
//    void public display()
//    {
//        System.out.println("hello from class c");
//    }
//}
////
////
//class airthmetic{
//
//    int a;
//    int b;
//    int c;
//
//    airthmetic()
//    {
//        System.out.println("hello");
//    }
//    airthmetic(int a)
//    {
//        this.a=a;
//    }
//    airthmetic(int a,int b)
//    {
//        this.a=a;
//        this.b=b;
//    }
//    public int add(int a,int b)
//    {
//        return a+b;
//    }
//    public int add(int a,int b,int c)
//    {
//        return a+b+c;
//    }
//    public int add(int a,int b,int c,int d)
//    {
//        return a+b+c+d;
//    }
//}
////
//class Animal
//{
//    public void sound()
//    {
//        System.out.println("Animal is sounding ");
//    }
//}
//class dog extends Animal{
//    public void bark()
//    {
//        System.out.println("Dog is braking");
//    }
//    public void sound()
//    {
//        System.out.println("dog is barking");
//    }
//}
//
//class cat extends Animal{
//    public void sound()
//    {
//        System.out.println("cat is meow");
//    }
//}
//
//public class Lab15 {
//    public static void main(String[] args) {
//        person1 p1=new person1(12,"Ankit");
//
//        p1.setName("Gaurav");
//        p1.display();
//
//        dog d1=new dog();
//
//        son s1=new son();
//        s1.singer();
//
//        cat c1=new cat();
//        c1.meow();
//
//        C c3=new C();
//        c3.print();
//
//    }
//}
//
//
//
//
//
//
