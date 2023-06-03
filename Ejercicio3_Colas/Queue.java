package EDA_LAB3.Ejercicio3_Colas;
import java.util.NoSuchElementException;

public class Queue<T> { // Creando una clase Generica.  	
    private Node<T> P_Element; // Creando los elemento de tipo privado "La raiz y la cola".
    private Node<T> Cola;

    public Queue() { // Creando el constructor e inicializando los elementos.
        this.P_Element = null; 
        this.Cola = null; // Null --> inidca que la cola esta vacia al inicio.
    }
    public void enqueue(T data) {  // Establecemos el metodo "enqueue" , el cual se encarga de agregar un elemento a la cola. 
        Node<T> newNode = new Node<>(data); // Crea y asigna un nuevo nodo a los datos existentes. 
        if (isEmpty()) {
        	P_Element = newNode;
        	Cola = newNode;  // Se verifica si la cola está vacía y se agrega un nuevo nodo al final de la cola.
        } else {
        	Cola.setNextNode(newNode);
            Cola = newNode;
        }
    }
}
