public class DoublyLinkedList<V> {
    public class Node{
        public Node prevNode;
        public Node nextNode;
        public V data;
    }
    private Node headNode;
    private Node tailNode;
    private Node currNode;
    private int size;
    public DoublyLinkedList(){
        headNode = null;
        tailNode = null;
        size = 0;
    }
    public boolean isEmpty(){
        return headNode == null;
    }

    public void insertAtHead(V data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = headNode;
        if(!isEmpty()){
            headNode.prevNode = newNode;
        }
        else
            tailNode = newNode;
        headNode = newNode;
        headNode.prevNode = null;
       // tailNode = tailNode.
        size++;
    }

    public void show(){
        if(isEmpty())
            return;
        currNode = headNode;
        while(currNode!=null){
            System.out.println(currNode.data);
            currNode = currNode.nextNode;
        }
    }

    public void insertAtEnd(V data){
        if(isEmpty())
            insertAtHead(data);
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;
        newNode.prevNode = tailNode;
        tailNode.nextNode = newNode;
        tailNode = newNode;
        size++;
    }

    public void insertAtAfter(V data,V after){
            if (isEmpty())
                insertAtHead(data);
            Node newNode = new Node();
            newNode.data = data;
            currNode = headNode;
            while (currNode!=null && !currNode.data.equals(after)) {
                currNode = currNode.nextNode;
            }
            newNode.nextNode = currNode.nextNode;
            if (currNode.nextNode != null)
                currNode.nextNode.prevNode = newNode;
            currNode.nextNode = newNode;
            newNode.prevNode = currNode;
            size++;
    }

    public void deleteAtHead(){
        if(isEmpty())
            return;
        if(size<=1){
            headNode.data = null;
            size--;
            return;
        }
        headNode = headNode.nextNode;
        headNode.prevNode = null;
        size--;
        return;
    }

    public void deleteAtEnd(){
        if(isEmpty())
            return;
        if(size <= 1){
            tailNode.data = null;
            return;
        }
        tailNode = tailNode.prevNode;

        //System.out.println("----");
        tailNode.nextNode = null;
        size--;
        return;
    }
    public int getSize(){
        return size;
    }

    public void deleteByValue(V data){
        if(size>1) {
            if (isEmpty())
                return;
            //Node temp = headNode;
            currNode = headNode;
            //System.out.println(currNode.data);
            if (currNode.data.equals(data))
                deleteAtHead();
            if (tailNode.data.equals(data))
                deleteAtEnd();
            //currNode = headNode;
            while (currNode != null && !currNode.data.equals(data)) {
                currNode = currNode.nextNode;
            }
            if (currNode != null) {
                if (currNode.nextNode == null) {
                    deleteAtEnd();
                    return;
                } else {
                    Node temp1;
                    // temp1 = currNode.prevNode;
                    //currNode
                    //System.out.println("--");
                    //System.out.println(currNode.prevNode.nextNode.data);

                    currNode.prevNode.nextNode = currNode.nextNode;
                    currNode.nextNode.prevNode = currNode.prevNode;
                    size--;
                }
            }
        }

    }



}
