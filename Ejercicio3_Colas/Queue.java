public class Queue<T> {  // Creando una clase Generica.
    private Node<T> root; // Creando los elemento de tipo privado "La raiz y la cola".
    private Node<T> tail;

    public Queue() {  // Creando el constructor e inicializando los elementos.
        this.root = null;
        this.tail = null; // Null --> inidca que la cola esta vacia al inicio.
    }