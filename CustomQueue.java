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
        Node newNode = new Node();
        if (isEmpty()) {
            head = newNode;
            newNode.setData(element);
        }else {
            Node currentNode = head;
            while (currentNode.getNext()!=null){
                currentNode = currentNode.getNext();
            }
                currentNode.setNext(newNode);
                newNode.setData(element);
        }
    }
    public Node remove(){
        Node node;
        if(isEmpty()){
            return null;
        }else {
            node=head;
            head = node.getNext();
            return node;
        }
    }

    public T getHead() {
        if (isEmpty()){
            return null;
        }
        return head.getData();
    }
}
