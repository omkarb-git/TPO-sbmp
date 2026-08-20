class Node
{
    int data;
    Node next;
    Node (int data)
    {
        this.data = data;
    }
}

public class Linkedlist
{
    public static void main (String [] args) 
    {
        Node start = new Node(10);
        start.next = new Node(20);
        start.next.next = new Node(30);
        start.next.next.next = new Node(40);
        System.out.print(start.data+ "->");
        System.out.print(start.next.data+ "->");
        System.out.print(start.next.next.data+ "->");

    }
}