
package DSAGLA;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedlist {

    static Node insertAtfirst(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        return head;
    }

    static Node insertAtLast(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    static void printlist(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    static Node Insertbetween(Node head,int pos,int data)
    {
        if (pos == 1) {
            Node newNode = new Node(data);
            newNode.next = head;
            return newNode;
        }
        if (pos < 1)
        {
            return head;
        }
        Node curr = head;

        for (int i = 1; i < pos - 1 && curr!= null; i++) {
            curr = curr.next;
        }
        Node newNode=new Node(data);
        newNode.next=curr.next;
        curr.next=newNode;

        return head;

    }

    //total number of nodes in the list
    static int countNode(Node head)
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
    //MAximum node in the list
    static int maxvalue(Node head)
    {
        int maximum= head.data;
        Node temp=head;
        while (temp!=null)
        {
            if(maximum<temp.data)
            {
                maximum= temp.data;
            }
            temp=temp.next;
        }
        return maximum;
    }
    static Node deleteatstart(Node head)
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        head=head.next;
        return head;
    }
    static Node deleteatend(Node head)
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    static boolean identical(Node head1,Node head2)
    {
        Node temp1=head1;
        Node temp2=head2;

        while(temp1!=null && temp2!=null)
        {
            if(temp1.data!= temp2.data)
            {
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }
    static Node reverse(Node head)
    {
        Node curr=head;
        Node prev=null;
        Node next=null;

        while (curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    static boolean ispal(Node head)
    {
        Node temp=head;
        Node rev=reverse(head);

        while(temp!=null)
        {
            if(temp.data!=rev.data)
            {
                return false;
            }
            temp=temp.next;
            rev=rev.next;
        }
        return true;
    }
    static boolean hascycle(Node head)
    {
        Node slow=head;
        Node fast=head;

        while (fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast)
            {
                return true;
            }
        }
        return false;
    }
    static Node MiddleNode(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(0);

        head = insertAtfirst(head, 1);
        head = insertAtLast(head, 2);
        head = insertAtLast(head, 3);
        head=Insertbetween(head,3,4);
//        head=deleteatend(head);
//        System.out.println(identical(head,head));
        printlist(head);

        head=reverse(head);
        System.out.println("Reversed list");
        printlist(head);

//        System.out.println(ispal(head));
    }
}
