import java.util.NoSuchElementException;

public class Stack<T> {
    private Node<T> root;

    public Stack() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void push(T datos) {
        Node<T> newNode = new Node<>(datos);
        if (isEmpty()) {
            root = newNode;
        } else {
            newNode.setNextNode(root);
            root = newNode;
        }
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack está vacío");
        }
        T data = root.getDatos();
        root = root.getNextNode();
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack está vacío");
        }
        return root.getDatos();
    }
}
