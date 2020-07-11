public class StackUsingLList<V> {
    public class Node{
        private V data;
        private Node next;
    }

    //private int top;
    private Node top;
    private Node curr;
    public int size;
    public StackUsingLList(){
        top = null;
        size = 0;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public boolean isFull(){
        Node temp = new Node();
        return temp==null ? true : false;
    }

    public void push(V data){
        if(isFull() || data == null){
            System.out.println("Memory is full or check data");
            return;
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = top;
        top = newNode;
        size++;
    }

    public V pop(){
        if(isEmpty()) {
            System.out.println("stack is empty");
            return null;
        }
        V temp = top.data;
        top = top.next;
        return temp;
    }

    public V peek(V val){
        if(val == null || isEmpty()){
            System.out.println("data is null or stack is empty");
            return null;
        }
        curr = top;
        while(curr != null){
            if(curr.data.equals(val))
                return curr.data;
            curr = curr.next;
        }
        return null;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("stack s empty");
        }
        curr = top;
        while (curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args){
        StackUsingLList obj = new StackUsingLList();
        obj.push(12);
        obj.push(1);
        obj.push(43);
        obj.push("kit harrin");
        obj.display();
        System.out.println(obj.pop());
        System.out.println(obj.isEmpty());
        obj.display();
        System.out.println(obj.isFull());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
    }
}
