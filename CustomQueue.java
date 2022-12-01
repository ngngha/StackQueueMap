import java.util.ArrayList;

public class CustomQueue<T> {
    private int size = 0;
    private ArrayList<T> queue = new ArrayList<>();
    
    public boolean isEmpty(){
        if(size == 0){
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
    //xóa ptu đầu hàng đợi
    public T remove() {
        T value = null;
        size = queue.size();
        if (isEmpty()) {
            return null;
        }else{
            value = queue.get(0);
            queue.remove(0);
        }
        return value;
    }
    //lấy ra ptu đầu hàng đợi
    public T getFirst() {
        size = queue.size();
        if (isEmpty()){
            return null;
        }
        return queue.get(0);
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        CustomQueue<Integer> q2 = new CustomQueue<>();
        q2.add(1);
        q2.add(2);
        System.out.println(q2);
        System.out.println(q2.getFirst());
        System.out.println(q2.getLast());
        q2.remove();
        System.out.println(q2);
        System.out.println(q2.getFirst());
        System.out.println(q2.getLast());
    }

}

