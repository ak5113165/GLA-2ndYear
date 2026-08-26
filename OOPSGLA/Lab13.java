package OOPSGLA;


class person{
    private int age;
    private String name;
    private String country;

    person(String name,String country,int age)
    {
        this.age=age;
        this.name=name;
        this.country=country;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setCountry(String country)
    {
        this.country=country;
    }
    public int getAge()
    {
        return age;
    }
    public String getCountry()
    {
        return country;
    }
    public String getName()
    {
        return name;
    }
    public void print()
    {
        System.out.println(name + " " + age + " " + country);
    }
}
public class Lab13 {

    public static void main(String[] args) {

       person p1=new person("Ankit","india",25);
       p1.print();
       p1.setAge(24);
       p1.print();
       System.out.println(p1.getAge());

    }
}
