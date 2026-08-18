package OOPSGLA;

import java.util.ArrayList;

class student
{

    String name;
    int age;
//    int phone;
//    static String collegename="GLA";
//    public  void print()
//    {
//        System.out.println(collegename);
//    }
    //constructor overloding.
    // Non-parmatrized contructor
    student()
    {
        System.out.println("Hello constructor ");
    }
    // paramtrized contructor
    student(String n)
    {
        name=n;
    }
    student(String name,int age)
    {
        System.out.println("Hello constructor is called");
        this.name=name;
        this.age=age;
    }
//    public void setvalues(String n,int a)
//    {
//        name=n;
//        age=a;
//    }
}
class Inverntory{
    ArrayList Products;

    Inverntory()
    {
        Products=new ArrayList<>();
    }
    public void AddProduct(String prod)
    {
        Products.add(prod);
    }
    public void RemoveProducts(String prod)
    {
        Products.remove(prod);
    }
    public boolean check(String prod)
    {
        return Products.contains(prod);
    }
    public void display()
    {
        System.out.println(Products);
    }

}

class human{
    String name;
    int age;
    human()
    {
        System.out.println("Contructor is 1");
        this("Ankit");
    }
    human(String name)
    {
        this.name=name;
        System.out.println("Contructor is 2");

        this(name,19);
    }
    human(String name,int age)
    {
        System.out.println("Contructor is 3");

        this.name=name;
        this.age=age;

    }

}
public class Lab10 {
    public static void main(String[] args) {

        //Write a Java program to create a class called "Inventory"
        // with a collection of products and methods
        // to add and remove products, and to check for low inventory.
//        Inverntory obj = new Inverntory();
//        obj.AddProduct("Tea");
//        obj.AddProduct("Salt");
//        obj.display();
//        student s1 = new student("Ankit", 23);


        // constructor overloading :-when we we are creating multiple contructors
        // with parameters that phenomena is called constructor overloading.

        human h1=new human("Aman");
    }
}