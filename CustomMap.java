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
    public void add(K key, V value){
        Node newNode = new Node(key, value, node);
        node = newNode;
    }
    public V get(K key){
        for (Node n = node; node != null; n = node.prev){
            if(key.equals(n.key)){
                System.out.println(n.value);
                return (V) n.value;
            }
        }
        return null;
    }
    V remove(K key){

        for (Node n = node; node != null; n = node.prev){
            if (n.prev!=null && n.prev.key==key){
                n.prev=n.prev.prev;
                return (V) n.prev;
            }
            if(n.prev==null && n.key==key){
                node = null;
                return (V) n;
            }
        }
        return null;
    }


}