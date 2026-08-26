package OOPSGLA;

import java.util.ArrayList;

class Desktop{
    private String brand;
    private String Processor;
    private int RAM;

    Desktop(String brand,String Processor,int RAM)
    {
        this.brand=brand;
        this.RAM=RAM;
        this.Processor=Processor;
    }
    public int getRAM()
    {
        return RAM;
    }
    public String getBrand()
    {
        return brand;
    }
    public String getProcessor()
    {
        return Processor;
    }
    public void setBrand(String brand)
    {
        this.brand=brand;
    }
    public String setProcessor(String Processor)
    {
        this.Processor=Processor;
    }
    public void setRAM(int RAM)
    {
        this.RAM=RAM;
    }

    public void UpgradeRam(int ram)
    {
        if(ram>0)
        {
            this.RAM=this.RAM+ram;
        }
        else {
            System.out.println("Invalid RAM");
        }
    }
}
class student
{
    private int id;
    private String name;
    private ArrayList grades;

    student(int id,String name)
    {
        this.id=id;
        this.name=name;
        this.grades=new ArrayList<>();
    }
    public int getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void addGrade(int grade)
    {
        if(grade>0)
        {
          grades.add(grade);
        }
        else
        {
            System.out.println("Invalid Grade");
        }
    }
    public void displayGrade()
    {
        System.out.println(grades);
    }
}
public class Lab14 {
    public static void main(String[] args) {

        student s1=new student(1,"Ankit");
        System.out.println(s1.getid());
        System.out.println(s1.getname());
        s1.setId(111);
        System.out.println(s1.getid());
        s1.addGrade(93);
        s1.addGrade(89);
        s1.displayGrade();



    }
}
