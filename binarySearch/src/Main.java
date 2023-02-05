public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,14};
        System.out.println(binarySearch(arr, 9));
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.head = new MyLinkedList.Node<>(1);
        myLinkedList.head.next = new MyLinkedList.Node<>(2);
        myLinkedList.head.next.next = new MyLinkedList.Node<>(3);

        printLinkedList(myLinkedList);
        reverseLinkedList(myLinkedList);
        System.out.println();
        printLinkedList(myLinkedList);
    }

    public static void printLinkedList(MyLinkedList linkedList){
        MyLinkedList.Node<Integer> current = linkedList.head;
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

    public static int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;

        while(low <= high){
            if(key > arr[mid]) low = mid + 1;
            else if(key == arr[mid]) return mid;
            else high = mid -1;
            mid = (low + high) /2;
        }
        return -1;
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