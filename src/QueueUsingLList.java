public class QueueUsingLList<T> {
    public class Node{
        private T data;
        private Node next;
    }
    private Node front;
    private Node rear;
    private int size;
    public QueueUsingLList(){
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public boolean isFull(){
        Node temp = new Node();
        return temp==null ? true : false;
    }

    public void enqueue(T val){
        if(isFull() || val == null){
            System.out.println("Memory is full or check data");
            return;
        }
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;
        if(front== null && rear == null){
            rear = newNode;
            front = newNode;
        }
        rear.next = newNode;
        rear = newNode;
        size++;
    }

    public T dequeue(){
        if(isEmpty()) {
            System.out.println("stack is empty");
            return null;
        }
        T temp = front.data;
        front = front.next;
        size--;
        return temp;
    }

    public void display(){
        if(isEmpty()) {
            System.out.println("stack is empty");
            return;
        }
        Node curr = new Node();
        curr = front;
        for(int i=0;i<size;i++){
           System.out.println(curr.data);
           curr = curr.next;
        }
    }

    public static void main(String[] args){
        QueueUsingLList obj = new QueueUsingLList();
        System.out.println(obj.isEmpty());
        obj.enqueue(2);
        obj.enqueue(5);
        obj.enqueue("kit har");
        obj.display();
        System.out.println(obj.dequeue());
        obj.display();
        System.out.println(obj.isEmpty());
        obj.display();
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        obj.display();
    }


}
