public class Stack<V> {
    public int max_size;
    public V[] array;
    public int top;

    public Stack(int max_size){
        this.max_size = max_size;
        array = (V[])new Object[max_size];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == max_size-1;
    }

    public V top(){
        if(isEmpty())
            return null;
        return array[top];
    }

    public void push(V data){
        if(isFull())
            return;
        array[++top] = data;
    }

    public V pop(){
        if(isEmpty())
            return null;
        return array[top--];
    }

    public void show(){
        while(top!=-1){
            System.out.println(array[top]);
            top--;
        }
    }




}
