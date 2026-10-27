package DSAGLA;

import java.util.Scanner;

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class linkedlist {
    static void insertAtfirst(Node head,int data)
    {
        if(head==null)
        {
            Node newNode=new Node(data);
            head=newNode;
        }
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    static void insertAtLast(Node head,int data)
    {
        if(head==null)
        {
            Node newNode=new Node(data);
            head=newNode;
        }
        Node newNode=new Node(data);
        Node temp=head;
        while (temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public static void main(String[] args) {

    }
}
