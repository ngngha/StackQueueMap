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
    
    private Node top;

    public CustomStack() {
    }

    public boolean isEmpty() {
        return top == null;
    }
    
     //đưa ptu vào đầu ngăn xếp
    public void push(T element) {
        Node newNode = new Node(element, top);
        top = newNode;
    }
    
    //lấy và xóa ptu đầu ngăn xếp
    public T pop() {
        T elementTop;
        if (isEmpty()) {
            return null;
        } else {
            elementTop = top.getData();
            top = top.getNext();
            return elementTop;
        }
    }
    
    //lấy ra ptu đầu ngăn xếp nhưng không xóa
    public T peek() {
        T elementTop;
        if (isEmpty()) {
            return null;
        } else {
            elementTop = top.getData();
            return elementTop;
        }
    }
    
}
