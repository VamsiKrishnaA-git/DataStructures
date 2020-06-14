public class SinglyLinkedList<V> {
    public class Node{
        public V data;
        public Node nextNode;
    }
    public Node headNode;
    public Node currNode;
    public int size;

    public SinglyLinkedList(){
        headNode = null;
        size = 0;
    }

    public boolean isEmpty(){
            return headNode == null;
    }

    public void insertAtHead(V data){
        Node newNode = new Node();
        newNode.data = data;

        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }

    public void insertAtAfter(V data,V after){
        currNode = headNode;
        Node newNode = new Node();
        newNode.data = data;
        while(!currNode.data.equals(after) && currNode != null){
            currNode = currNode.nextNode;
        }
        newNode.nextNode = currNode.nextNode;
        currNode.nextNode = newNode;
        size++;

    }

    public void insertAtEnd(V data){

        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty())
            insertAtHead(data);
        else {
            currNode = headNode;
            while(currNode.nextNode != null ){
                currNode = currNode.nextNode;
            }
            currNode.nextNode = newNode;
            newNode.nextNode = null;
        }
    }

    public boolean searchElement(V data){
        currNode = headNode;
        if(isEmpty())
            return false;
        else {
            while (currNode != null) {
                if (currNode.data.equals(data))
                    return true;
                currNode = currNode.nextNode;
            }
            return false;
        }

    }

    public void deleteByVal(V data){
        if(isEmpty())
            return;
        currNode = headNode;
        Node prevNode = new Node();
        prevNode = headNode;
        if(currNode.data.equals(data))
            deleteAtHead();
        while(currNode != null){
            if(currNode.data.equals(data)){
                prevNode.nextNode = currNode.nextNode;
            }
            prevNode = currNode;
            currNode = currNode.nextNode;
        }
    }

    public void deleteAtHead(){
        if(isEmpty()) {
            return;
        }
        headNode = headNode.nextNode;
        return;
    }

    public void deleteAtEnd(){
        if(isEmpty())
            return;
        currNode = headNode;
        while(currNode.nextNode.nextNode!=null){
            currNode = currNode.nextNode;
        }
        currNode.nextNode = null;
        return;
    }


    public void show(){
        currNode = headNode;
        while(currNode!=null){
            System.out.println(currNode.data);
            currNode = currNode.nextNode;
        }
    }


}
