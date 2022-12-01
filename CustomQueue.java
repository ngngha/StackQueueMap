import java.util.ArrayList;

public class CustomQueue<T> {
    private ArrayList<T> queue = new ArrayList<>();
    public boolean isEmpty(){
        if(queue.size() == 0){
            return true;
        }
        return false;
    }

    public String toString() {
        return "queue=" + queue;
    }
    //thêm ptu vào hàng đợi
    public void add(T element) {
        queue.add(element);
    }
    //xóa đi ptu đầu hàng đợi
    public T remove() {
        T x;
        x = queue.get(0);
        if (isEmpty()) {
            return null;
        }else{
            queue.remove(0);
            return x;
        }
    }
    //lấy ra ptu đầu ngăn xếp nhưng không xóa
    public T getFirst() {
        if (isEmpty()){
            return null;
        }
        return queue.get(0);
    }

    public T getLast() {
        if (isEmpty()){
            return null;
        }
        return queue.get(queue.size()-1);
    }
    
}
