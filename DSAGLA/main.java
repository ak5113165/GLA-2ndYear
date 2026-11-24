package DSAGLA;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class queue
{
    private int []arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    queue(int capacity)
    {
        this.capacity=capacity;
        front=0;
        rear=-1;
        size=0;
        arr=new int[capacity];
    }
    public void enqueue(int x)
    {
        if(isfull()==true)
        {
            System.out.println("Overflow condition");
            return ;
        }
        rear=(rear+1)%capacity;
        arr[rear]=x;
        size++;
    }
    public int dequeue()
    {
        if(isempty()==true)
        {
            System.out.println("underflow condition");
            return -1;
        }
        int removeditem=arr[front];
        front=(front+1)%capacity;
        size--;
        return removeditem;
    }
    public int peek()
    {
        if(isempty()==true)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    public boolean isempty()
    {
        return size==0;
    }
    public boolean isfull()
    {
        return size==capacity;
    }

}

public class main {

    static int add(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        queue q1=new queue(5);
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.dequeue();
        System.out.println(q1.peek());


    }

}
