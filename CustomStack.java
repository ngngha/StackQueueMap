import java.util.ArrayList;

public class CustomStack<T> {
    private int top;
    private int size;
    private ArrayList<T> stack;
    //last in first out
    public CustomStack(int size){
        this.size = size;
        stack = new ArrayList<>(size);
        top = -1;
    }
    //đưa ptu vào đầu ngăn xếp
    public void push(T element){
        if(top + 1 == size){
            System.out.println("Is Full");
        }else {
            top++;
            stack.add(element);
        }
    }
    //lấy và xóa ptu đầu ngăn xếp
    public T pop(){
        T x;
        if (isEmpty()){
            return null;
        }else {
            x = stack.get(top);
            stack.remove(x);
            top--;
            return x;
        }
    }
    //lấy ra ptu đầu ngăn xếp nhưng không xóa
    public T peek(){
        if(isEmpty()){
            return null;
        }else {
            return stack.get(top);
        }
    }
    public boolean isEmpty() {
        return (top==-1);
    }
    //trả về biểu diễn đối tượng dạng chuỗi
    public String toString()
    {
        String chuoi = "";
        for (int i = 0; i < top; i++) {
            chuoi += String.valueOf(stack.get(i)) + ", ";
        }
        chuoi += String.valueOf(stack.get(top));
        return chuoi;
    }
    
}
