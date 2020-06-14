public class Main {
    public static void main(String[] args){
        SinglyLinkedList obj = new SinglyLinkedList();
        System.out.println(obj.isEmpty());
       // obj.insertAtHead(2);
        obj.insertAtHead(5);
        obj.insertAtHead(8);
        //obj.insertAtAfter(2,8);
        //obj.insertAtAfter(10,5);
        obj.insertAtEnd(15);
        obj.insertAtEnd(121);
        //obj.deleteAtEnd();
        //obj.deleteAtHead();
        obj.deleteAtHead();
        obj.deleteByVal(58888);
        System.out.println(obj.searchElement(5455));
        obj.show();

    }

}
