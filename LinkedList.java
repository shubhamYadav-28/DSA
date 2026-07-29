package linkedList;

public class LinkedList {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        LinkedList List = new LinkedList();
        Node head= List. new Node(10);
        head.next = List.new Node(20);
        head.next.next = List.new Node(30);
        head.next.next.next = List.new Node(40);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
       
    }
    
}
}
