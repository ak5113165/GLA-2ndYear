package OOPSGLA;

import java.util.ArrayList;
import java.util.Scanner;

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
}

public class Lab11 {
    public static void main(String[] args) {



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
            System.out.println("Enetrr the title");
            String title=sc.nextLine();
            System.out.println("Enter the director");
            String Director=sc.nextLine();
            data[i]= new Movie(title,Director,arr);
        }
        for(int i=0;i< data.length;i++)
        {
            data[i].display();
        }
        int a=0;
        System.out.println(a);


    }
}
