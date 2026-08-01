package linkedList;

public class HeadShot {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void insertAtHead(int value){
        Node newNode = this. new Node(value);
        newNode.next = head;
        head = newNode;
    }
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        HeadShot List = new HeadShot();
        List.insertAtHead(10);
        List.insertAtHead(90);
        List.insertAtHead(909);
        List.printList();
    }
    
}
