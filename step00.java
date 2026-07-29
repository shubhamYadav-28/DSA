package linkedList;
public class step00 {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {

        step00 obj = new step00();   // Outer class object
        Node n = obj.new Node(10);   // Inner class object

        System.out.println(n.data);
        System.out.println(n.next);
        System.out.println(n);
    }
}