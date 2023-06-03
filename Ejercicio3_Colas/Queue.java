import java.util.NoSuchElementException;

public class Queue<T> { // Creando una clase Generica.  	
    private Node<T> P_Element; // Creando los elemento de tipo privado "La raiz y la cola".
    private Node<T> Cola;

    public Queue() { // Creando el constructor e inicializando los elementos.
        this.P_Element = null; 
        this.Cola = null; // Null --> inidca que la cola esta vacia al inicio.
    }
