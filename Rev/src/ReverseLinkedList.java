public class ReverseLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.head = new MyLinkedList.Node(1);
        myLinkedList.head.next = new MyLinkedList.Node(2);
        myLinkedList.head.next.next = new MyLinkedList.Node(3);

        print(myLinkedList);
        reverse(myLinkedList);
        System.out.println();
        print(myLinkedList);
    }
    public static void print(MyLinkedList myLinkedList){
        var current = myLinkedList.head;
        while (current != null){
            System.out.printf("%d ", current.data);
            current = current.next;
        }
    }

    public static void reverse(MyLinkedList myLinkedList){
        MyLinkedList.Node previous = null;
        var current = myLinkedList.head;
        MyLinkedList.Node next;

        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        myLinkedList.head = previous;
    }
}


class MyLinkedList{
    Node head;

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
}
