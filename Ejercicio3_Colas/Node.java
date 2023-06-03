package EDA_LAB3.Ejercicio3_Colas;

public class Node<T> { // Creamos nuestra clase generica "Node" / lista enlazada.
	    private T data; // Elemento privado que representa los datos almacenados en el Node <T>.
	    private Node<T> nextNode;

	    public Node(T data) { // Creando el constructor de la clase Node.
	        this.data = data;  // Inicializa el nodo.
	        this.nextNode = null; 
	    }
	    
	    // Se crean los getters y el setter
	    public T getData() {
	        return data;  		// Devuelven los datos almacenados en los nodos.
	    }

	    public Node<T> getNextNode() {
	        return nextNode;
	    }

	    public void setNextNode(Node<T> nextNode) {
	        this.nextNode = nextNode;	//Asigna el siguinete elemento a lo del actual.
	    }
}
