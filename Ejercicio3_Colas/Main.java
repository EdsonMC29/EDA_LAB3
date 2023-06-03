package EDA_LAB3.Ejercicio3_Colas;


public class Main {
	public static void main(String[] args) {
		
		Queue<Integer> queue = new Queue<>(); //Se crea una cola de tipo Integer y para luego agragar elmentos.
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4); // 6 Elementos
		queue.enqueue(5);
		queue.enqueue(6); // Se agrega este elemento al final de la cola.

		System.out.println("____________________________________________");
		System.out.println("                                            ");
		System.out.println("Tamaño del Elemento: " + queue.size());         //Tamaño de la cola 6.
		System.out.println("Primer Elemento de la Cola: " + queue.peek());  //Imprime el elemento al frente de la cola sin eliminarlo 1.
		System.out.println("____________________________________________");

		int element = queue.dequeue();										//Se elimina y se guarda el elemento al frente de la cola.
		System.out.println("                                            ");
		System.out.println("Elemento Eliminado: " + element); 				//Imprime el elemento eliminado de la cola 1.
		System.out.println("                                            ");

		System.out.println("Nuevo Tamaño de Elemento: " + queue.size()); 	//Imprime el tamaño de la cola despues de elimarlo 5.
		System.out.println("Nuevo Primer Elemento: " + queue.peek()); 		// Imprime el elemento al frente, despues de haber eliminado 2.
		System.out.println("____________________________________________");

	}
	
}
