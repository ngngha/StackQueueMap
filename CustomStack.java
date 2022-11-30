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
        if (!isEmpty()){
//            top--;
            stack.remove(stack.get(top));
            size = top--;
        }
        return null;
    }
    //lấy ra ptu đầu ngăn xếp nhưng không xóa
    public T peek(){
        if(!isEmpty()){
            return stack.get(top);
        }
        return null;
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

    public static void main(String[] args) {
        CustomStack<Integer> S = new CustomStack<>(4);
        S.push(0);
        S.push(25);
        S.push(21);
        System.out.println("S after push data: "+S);
        S.pop();
        System.out.println("S after popping: "+ S);
        System.out.println("Peek: "+ S.peek());
        System.out.println(S.size);

        CustomStack<String> S1 = new CustomStack<>(5);
        S1.push("0");
        S1.push("ha");
        S1.push("hai");
        S1.push("hia");
        S1.push("ah");
        S1.push("tim");
        System.out.println("S after push data: "+S1);
        System.out.println(S1.size);
        S1.pop();
        System.out.println("S after popping: "+ S1);
        System.out.println("Peek: "+ S1.peek());
        System.out.println(S1.size);
    }
}
