package OOPSGLA;

import java.time.LocalDate;
import java.time.Period;

class employee{
    String name;
    int salary;
    LocalDate hiredate;
    LocalDate termination;
    public Period services(){
      return Period.between(hiredate,termination);
    }
    employee(String n,int s,LocalDate h,LocalDate t)
    {
        name=n;
        salary=s;
        hiredate=h;
        termination=t;
    }
    public  void display()
    {
        System.out.println(name);
        System.out.println(salary);
        System.out.println(hiredate);
    }
}
public class Lecture4 {
    public static void main(String[] args) {
//        Write a Java program to create a class called "Employee" with a name, salary,
//        and hire date attributes,
//        and a method to calculate years of service.
        LocalDate currentdate=LocalDate.now();
        System.out.println(currentdate);
        System.out.println(LocalDate.of(2026,8,12));

        employee obj=new employee("ANkit",180000,LocalDate.of(2020,1,12),LocalDate.of(2026,1,11));
        obj.display();
        Period p=obj.services();
        System.out.println(p.getYears() + "years");
        System.out.println(p.getMonths() + "months");
        System.out.println(p.getDays() + "days");

    }
}
