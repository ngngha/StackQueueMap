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

    public void add(T element) {
        queue.add(element);
    }

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

    public T front() {
        if (isEmpty()){
            return null;
        }
        return queue.get(0);
    }

    public T rear() {
        if (isEmpty()){
            return null;
        }
        return queue.get(queue.size()-1);
    }
    
}
