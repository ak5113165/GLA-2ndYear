package OOPSGLA;

import java.util.ArrayList;
import java.util.Scanner;
//MEthod Overloading
class addition
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
class Movie{
    String title;
    String Director;
    ArrayList actors;
    ArrayList Reviews;

    Movie(String title,String Director,ArrayList actors)
    {
        this.title=title;
        this.Director=Director;
        this.actors=actors;
        Reviews=new ArrayList<>();
    }
    public void addReview(String rev)
    {
        Reviews.add(rev);
    }
    public void RemoveReview(String rev)
    {
        Reviews.remove(rev);
    }
    public void display()
    {
        System.out.println(Reviews);
    }
}

public class Lab11 {
    public static void main(String[] args) {

        addition a=new addition();
        System.out.println(a.add(2,3,4));
        //Write a Java program to create a class called "Movie"
        // with attributes for title, director, actors, and reviews,
        // and methods for adding and retrieving reviews.
        ArrayList actors=new ArrayList<>();
        actors.add("Tom Holland");
        Movie m1=new Movie("Spiderman","Marvel",actors);

        Scanner sc=new Scanner(System.in);
        Movie []data= new Movie[5];
        for(int i=0;i< data.length;i++)
        {
            ArrayList arr=new ArrayList<>();
            System.out.println("Enter the title");
            String title=sc.nextLine();
            System.out.println("Enter the director");
            String Director=sc.nextLine();
            data[i]= new Movie(title,Director,arr);
        }
        for(int i=0;i<data.length;i++)
        {
            data[i].display();
        }





    }
}
