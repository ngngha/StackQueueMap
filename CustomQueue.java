import java.util.ArrayList;

public class CustomQueue<T> {
    private int front= -1;
    private int rear= -1;
    private ArrayList<T> queue = new ArrayList<>();
    //lấy ra ptu đầu hàng đợi
    public T front(){
        if(front!=-1){
            return queue.get(front);
        }
        return null;
    }
    //lấy ra ptu mới vào hàng đợi
    public T rear(){
        if(rear!=-1){
            return queue.get(rear);
        }
        return null;
    }
    //thêm ptu vào hàng đợi
    public void enqueue(T element){
        if(isEmpty()){
            rear = 0;
            front = 0;
            queue.add(element);
        }else{
            front++;
            queue.add(element);
        }
    }
    //xóa ptu đầu hàng đợi
    public T dequeue(){
        T x;
        x = queue.get(front);
        if(isEmpty()){
            return null;
        }else if(front == rear){
            front = rear = -1;
            queue.remove(x);
            return x;
        }else{
            queue.remove(x);
            rear++;
            return x;
        }
    }

    public boolean isEmpty(){
        if(front == -1 && rear == -1){
            return true;
        }
        return false;
    }

    public String toString() {
        return "queue=" + queue;
    }

    public static void main(String[] args) {
        CustomQueue<String> q1 = new CustomQueue<>();
        q1.enqueue("ha");
        q1.enqueue("hai");
        q1.enqueue("hieu");
        q1.enqueue("duc");
        q1.enqueue("quy");
        System.out.println("Queue: "+q1);
//        q1.remove();
        System.out.println("Q1's head: "+q1.front());
        System.out.println("Q1 rear: "+q1.rear());
    }

}

