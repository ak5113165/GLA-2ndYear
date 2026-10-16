package DSAGLA;
import java.util.Stack;

class stackExample{
    private int size;
    private int top;
    private int []arr;

    stackExample(int size)
    {
        this.size=size;
        this.top=-1;
        arr=new int[size];
    }

    public boolean isempty()
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isfull()
    {
        if(top==size-1)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public int peek()
    {
        if(isempty()==true)
        {
            System.out.println("No elements in the stack");
            return -1;
        }
        else {

         return arr[top];
        }
    }

    public void push(int x)
    {
        if(isfull()==true)
        {
            System.out.println("Stack overflow");
            return ;
        }
        else
        {
            arr[++top]=x;
            System.out.println("Element pushed in to the stack is " + x);
        }
    }

    public int pop()
    {
        if(isempty()==true)
        {
            System.out.println("stack is underflow");
            return -1;
        }
        else {
            int popedelement=arr[top];
            top--;
            return popedelement;
        }
    }
    public void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}

public class Lab14 {

    public static void main(String[] args) {

        stackExample s1=new stackExample(5);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        System.out.println(s1.pop());
        s1.display();

        Stack<Integer> s=new Stack<>();


    }
}
