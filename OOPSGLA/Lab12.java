//package OOPSGLA;
//
//class bankaccount{
//    private int accnum;
//    private int balance;
//
//    bankaccount(int accnum,int balance)
//    {
//        this.accnum=accnum;
//        if(balance>0)
//        {
//            this.balance=balance;
//        }
//
//    }
//    public int getBalance()
//    {
//        return balance;
//    }
//    public int getAccnum()
//    {
//        return accnum;
//    }
//    private void deposit(int amount)
//    {
//        if(amount>0)
//        {
//            balance+=amount;
//        }
//        else
//        {
//            System.out.println("Invalid amount");
//        }
//    }
//    public void getdeposit(int amount)
//    {
//        deposit(amount);
//    }
//}
//class student{
//    private int age;
//    String name;
//
//    public void set(int age)
//    {
//        this.age=age;
//    }
//    public int get()
//    {
//        return age;
//    }
//    private void display()
//    {
//        System.out.println(age);
//    }
//    public void getdisplay()
//    {
//        display();
//    }
//}
//
//public class Lab12 {
//
//    public static void main(String[] args) {
//
//
//
//      // create bankaccount 1,accnum 2 balance private atrributes
//        //you need to create a deposit method to deposit the money
//        bankaccount b1=new bankaccount(123456,50);
//        System.out.println(b1.getBalance());
//        b1.getdeposit(15);
//        System.out.println(b1.getBalance());
//
//
//    }
//}
