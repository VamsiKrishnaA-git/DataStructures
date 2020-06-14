public class CircularQueue<V> {
    private int max_size;
    private int front;
    private int rear;
    private int currSize;
    private V[] array;

    public CircularQueue(int max_size){
        this.max_size = max_size;
        array = (V[])new Object[max_size];
        front = 0;
        rear = -1;
        currSize = 0;
    }

    public boolean isEmpty(){
        return currSize == 0;
    }

    public boolean isFull(){
        return currSize == max_size;
    }

    public V top(){
        if(isEmpty())
            return null;
        return array[currSize];
    }

    public void enqueue(V data){
        if(isFull())
            return;
        rear = (rear + 1)%max_size;
        array[rear] = data;
        currSize++;

    }

    public V dequeue(){
        if(isEmpty())
            return null;
        V temp = array[front];
        front = (front + 1)%max_size;
        currSize--;
        return temp;
    }

    public void show(){
        for(int i = front;i< currSize;i++){
            System.out.println((array[(i)%max_size]));
        }
    }
}
