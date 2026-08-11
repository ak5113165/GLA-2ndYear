package OOPSGLA;

import java.util.Scanner;

class company
{
      String name;
      int Revenue;
      int employees;
      public  static void print()
      {
          System.out.println("This is static method");
      }
      public void display()
      {
          System.out.println(name + " " + Revenue + " " + employees);
      }
      public void setvalues(String n,int r,int e)
      {
          name=n;
          Revenue=r;
          employees=e;
      }

}
public class LAB7 {
    //MEthod accepting object as an parameteres

    public static void printvalues(company c)
    {
        System.out.println(c.name + " " + c.Revenue + " " + c.employees);
    }

    public static company createcompany()
    {
        company c3=new company();
        c3.setvalues("Google",45,89);
        return c3;
    }
    public static void main(String[] args) {

           int a=10;

           company c1=new company();
           c1.setvalues("JPMC",23,1);
           company.print();
           company c2=new company();
           c2.setvalues("Microsft",19,234);

           printvalues(c1);
           printvalues(c2);

           company c3=createcompany();
           System.out.println(c3.name);

    }
}
