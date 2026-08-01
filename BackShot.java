package linkedList;
public class BackShot {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void insertATail(int value){
        Node current = head;
        while(current !=null){
        current = current.next;
    }
    Node Tail = current;
    Node newNode = this. new Node(value);
    Tail.next = newNode;
    Tail = newNode;
}
public void printList(){
    Node current = head;
    while(current !=null){
        System.out.println(current.data +" ");
        current = current.next;
    }
}
public static void main(String[] args) {
    BackShot List = new BackShot();
    List.insertATail(10);
    List.insertATail(20);
    List.insertATail(30);
    List.printList();
}
}
    
