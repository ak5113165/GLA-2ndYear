package OOPSGLA;

import java.sql.SQLOutput;
import java.util.ArrayList;

class student
{
    String name;
    int age;
    //Non-paramatrized constructors

    student()
    {
        System.out.println("Constructor with onlu 0 parameter");
    }// paramtrized
    student(String n,int a)
    {
        System.out.println("Constructor with onlu 2 parameter");

        name=n;
        age=a;
    }
    student(String n)
    {
        System.out.println("Constructor with onlu 1 parameter");
    }
    student(int a)
    {
        System.out.println("Constructor with onlu 1 parameter");
    }
}
class Inventory{
    ArrayList products;

    Inventory()
    {
        products=new ArrayList<>();
    }
    public void addProdcut(String prod)
    {
        products.add(prod);
    }
    public void remove(String prod)
    {
        products.remove(prod);
    }
    public void display()
    {
        System.out.println(products);
    }
    public boolean check(String prod)
    {
        return products.contains(prod);
    }
}

class human{
    String name;
    int age;
    //constructor chaining;
    human()
    {
        System.out.println("contructor 0 ");
        this("Ankit");
    }
    human(String name)
    {
        System.out.println("contructor 1 ");
        this(name,19);
    }
    human(String name,int age)
    {
        System.out.println("contructor 2 ");
        this.name=name;
        this.age=age;
    }
}

public class Lab10 {
    public static void main(String[] args) {

        //Write a Java program to create a class called "Inventory"
        // with a collection of products and methods
        // to add and remove products, and to check for low inventory.
//
//        ArrayList<Integer>arr=new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//
//        arr.remove(1);
//        Inventory i1=new Inventory();
//        i1.addProdcut("Namak");
//        i1.addProdcut("Shakkar");
//        i1.remove("Shakkar");
//        i1.display();
//        System.out.println(i1.check("Namak"));

       student s1=new student("Ankit",22);
       student s3=new student("Amar");
       student s2=new student();

       human h1=new human();



        // constructor overloading :-when we we are creating multiple contructors
        // with parameters that phenomena is called constructor overloading.


    }
}