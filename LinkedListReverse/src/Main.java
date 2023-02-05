public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.head = new MyLinkedList.Node<>(1);
        myLinkedList.head.next = new MyLinkedList.Node<>(2);
        myLinkedList.head.next.next = new MyLinkedList.Node<>(3);

        printLinkedList(myLinkedList);
        reverseLinkedList(myLinkedList);
        System.out.println();
        printLinkedList(myLinkedList);
    }
    public static void printLinkedList(MyLinkedList linkedList) {
        MyLinkedList.Node current = linkedList.head;
        while(current != null){
            System.out.printf("%d ", current.data);
            current = current.next;
        }
    }

    public static void reverseLinkedList(MyLinkedList linkedList){
        MyLinkedList.Node previous = null;
        MyLinkedList.Node current = linkedList.head;
        MyLinkedList.Node next;

        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        linkedList.head = previous;
    }
}



class MyLinkedList{
    public Node head;

    static class Node<T>{
        Node next;
        T data;

        public Node(T data){
            this.data = data;
        }
    }
}