public class Node<T> {
    private T datos;
    private Node<T> nextNode;

    public Node(T datos) {
        this.datos = datos;
        this.nextNode = null;
    }

    public T getDatos() {
        return datos;
    }

    public void setDatos(T datos) {
        this.datos = datos;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}
