public class CustomQueue<T> {

    private class Node{
        T data;
        Node next;

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

        public Node() {
        }
        
    }
    private Node head;

    public CustomQueue() {
    }
    
    public boolean isEmpty() {
        return head == null;
    }

    public void add(T element){
        Node x = new Node();
        if (isEmpty()) {
            head = x;
            x.setData(element);
        }else {
            Node tempNode = head;
            while (tempNode.getNext()!=null){
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(x);
            x.setData(element);
        }
    }
    public Node remove(){
        Node x;
        if(isEmpty()){
            return null;
        }else {
            x=head;
            head = x.getNext();
            return x;
        }
    }

    public T getHead() {
        if (isEmpty()){
            return null;
        }
        return head.getData();
    }
}
