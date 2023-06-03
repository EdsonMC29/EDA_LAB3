package EDA_LAB3.Ejercicio3_Colas;

public class Main {
	public static void main(String[] args) {
		
		Queue<Integer> queue = new Queue<>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);

		System.out.println("Size: " + queue.size()); // Output: Size: 3
		System.out.println("Front: " + queue.peek()); // Output: Front: 1

		int element = queue.dequeue();
		System.out.println("Dequeued: " + element); // Output: Dequeued: 1

		System.out.println("Size: " + queue.size()); // Output: Size: 2
		System.out.println("Front: " + queue.peek()); // Output: Front: 2

	}
	
}
