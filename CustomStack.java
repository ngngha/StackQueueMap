//last in first out
public class CustomStack<T> {
    private class Node {
        T data;
        Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    
    Node top;

    public CustomStack() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }
     //đưa ptu vào đầu ngăn xếp
    public void push(T element) {
        Node node = new Node(element, top);
        top = node;
    }
    //lấy và xóa ptu đầu ngăn xếp
    public T pop() {
        T x;
        if (isEmpty()) {
            return null;
        } else {
            x = top.getData();
            top = top.getNext();
            return x;
        }
    }
    //lấy ra ptu đầu ngăn xếp nhưng không xóa
    public T peek() {
        T x;
        if (isEmpty()) {
            return null;
        } else {
            x = top.getData();
            return x;
        }
    }
    
}
