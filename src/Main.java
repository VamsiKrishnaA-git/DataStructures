public class Main {
    public static void main(String[] args){
        SinglyLinkedList obj = new SinglyLinkedList();
        System.out.println(obj.isEmpty());
       // obj.insertAtHead(2);
        //obj.insertAtHead(5);
       // obj.insertAtHead(8);
        //obj.insertAtAfter(2,8);
        //obj.insertAtAfter(10,5);
        //obj.insertAtEnd(15);
        //obj.insertAtEnd(121);
        //obj.deleteAtEnd();
        //obj.deleteAtHead();
        //obj.deleteAtHead();
        //obj.deleteByVal(58888);
        Stack obj1 = new Stack(5);
        //System.out.println(obj1.isEmpty());
        //obj1.push(8);
        //obj1.push(9);
        //obj1.push(12);
        //obj1.push(128);
        //obj1.push(111);
        //obj1.push(12);
        //obj1.pop();
        //obj1.pop();
        CircularQueue obj2 = new CircularQueue(5);
        obj2.enqueue(5);
        obj2.enqueue(6);
        obj2.enqueue(8);
        //System.out.println(obj2.dequeue());
        obj2.dequeue();
        obj2.dequeue();
        obj2.dequeue();
       // System.out.println(obj1.pop());
        //System.out.println(obj1.top);
        obj2.show();

    }

}
