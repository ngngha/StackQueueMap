public class CustomMap<K, V>{
    private class Node<K, V>{
        K key;
        V value;
        Node<K, V> prev;

        public Node(K key, V value, Node<K, V> prev) {
            this.key = key;
            this.value = value;
            this.prev = prev;
        }
    }
    
    private Node node= null;
    
    public CustomMap(){
    }
    
    public boolean containsKey(K key){
        for (Node<K, V> currentNode = node; currentNode != null; currentNode = currentNode.prev) {
            if (key.equals(currentNode.key)) {
                return true;
            }
        }
        return false;
    }
    
    public void add(K key, V value){
        if (containsKey(key)){
            System.out.println("Key already existed. Key must be unique.");
        }else {
            Node<K, V> newNode = new Node<>(key, value, node);
            node = newNode;
        }
    }
    
    public V get(K key){
        for (Node<K, V> currentNode = node; currentNode != null; currentNode = currentNode.prev) {
            if (key.equals(currentNode.key)) {
                System.out.println(currentNode.value);
                return (V) currentNode.value;
            }
        }
        return null;
    }
    
    V remove(K key){
        for (Node<K, V> currentNode = node; currentNode != null; currentNode = currentNode.prev) {
            if (currentNode.prev != null && currentNode.prev.key == key){
                Node<K, V> remove = currentNode.prev;
                currentNode.prev = currentNode.prev.prev;
                return remove.value;
            }
            if (currentNode.key == key){
                Node<K, V> remove = currentNode;
                node = currentNode.prev;
                return remove.value;
            }
        }
        return null;
    }
}
