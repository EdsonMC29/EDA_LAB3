package EDA_LAB3.Ejercicio3_Colas;
import java.util.NoSuchElementException;

public class Queue<T> { // Creando una clase Generica.  	
    private Node<T> raiz; // Creando los elemento de tipo privado "La raiz y la cola".
    private Node<T> Cola;

    public Queue() { // Creando el constructor e inicializando los elementos.
        this.raiz = null; 
        this.Cola = null; // Null --> inidca que la cola esta vacia al inicio.
    }
    public void enqueue(T data) {  // Establecemos el metodo "enqueue" , el cual se encarga de agregar un elemento a la cola. 
        Node<T> newNode = new Node<>(data); // Crea y asigna un nuevo nodo a los datos existentes. 
        if (isEmpty()) {
        	raiz = newNode;
        	Cola = newNode;  // Se verifica si la cola está vacía y se agrega un nuevo nodo al final de la cola.
        } else {
        	Cola.setNextNode(newNode);
            Cola = newNode;
        }
    }
    public T dequeue() {  // Se crea le metodo "dequeue", el cual elimina un elemento y devuelve el siguiente al frente de la cola.
        if (isEmpty()) {
            throw new NoSuchElementException("La Cola esta vacia."); // Si la cola esta vacia manda una excepcion. 
        }
        T data = raiz.getData();  // 
        raiz = raiz.getNextNode();
        if (raiz== null) {   // Verficamos si la raiz esta vacio, si es asi, la cola tambien sera vacia.
        	Cola = null;
        }
        return data; // Se retorna "data" el cual contiene un valor almacenado.
    }

    public T peek() {  //Utilizamos el metodo "peek" para obtener el elemento al frente de la cola sin eliminarlo.
        if (isEmpty()) { // si la cola se encuentra vacia nos lanza una excepcion, imprimiendo el sms de la siguiente linea.
            throw new NoSuchElementException("La Cola esta vacia."); 
        }
        return raiz.getData(); //Si la cola no está vacía, se devuelve el valor de los datos del nodo raíz.
    }

    public boolean isEmpty() { // Utilizamos este metodo para verificar si la cola esta vacia.	
        return raiz == null; // Devuelve true si "raiz" es null, lo que significa que no hay nodos en la cola, y false en caso contrario.
    }
    public int size() { // Este metodo devueleve el tamaño de la cola.
        int count = 0; // Contador
        Node<T> currentNode = raiz;
        while (currentNode != null) {
            count++;       // recorre los nodos de la cola, incrementando el contador por cada nodo encontrado.
            currentNode = currentNode.getNextNode();
        }
        return count; // Al final, devuelve el valor de count.
    }
}
