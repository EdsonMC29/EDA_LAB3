package lab03;
import java.util.Stack;
public class PilasIguales_parte1 {

	public static void main(String[] args) {
		int mayorAltura = 0;
		
		Stack<Integer> h1 = new Stack<Integer>();
		h1.push(1);
		h1.push(1);
		h1.push(2);
		h1.push(1); //---> cima
		Stack<Integer> h2 = new Stack<Integer>();
		h2.push(2);
		h2.push(1);
		h2.push(1); //---> cima
	
		Stack<Integer> h3 = new Stack<Integer>();
		h3.push(1);
		h3.push(1); //---> cima

		int a = alturaTotal(h1);
		int b = alturaTotal(h2);
		int c = alturaTotal(h3);
		
		while(a != b ||	a != c || b != c ) {
			mayorAltura = (a>=b)?a:b;
			mayorAltura = (mayorAltura>=c)?mayorAltura:c;
			//System.out.println("Mayor: " + mayorAltura);
			
			if(mayorAltura == a) { 
				h1.pop();
				a = alturaTotal(h1);
			//	System.out.println("Altura de h1: " + a);
			}
			if(mayorAltura == b) { 
				h2.pop();
				b = alturaTotal(h2);
			//	System.out.println("Altura de h2 :" + b);
			}
			if(mayorAltura == c) {
				h3.pop();
				c = alturaTotal(h3);
			//	System.out.println("Altura de h3 :" + c);
			}
		}
		System.out.println("---ALTURAS---");
		System.out.println("h1: " + a);
		System.out.println("h2: " +b);
		System.out.println("h3: " +c);
		
		if(a == b && a == c )
			System.out.println("Maxima altura posible es: " + alturaTotal(h1));
		else
			System.out.println("No tienen una altura en comun posible");
	}
	
	//encontrando altura total de una pila
	public static int alturaTotal(Stack<Integer> h) {
		int altura = 0;
		for (Integer integer : h) {
		    altura += integer;
		}	
		return altura;
	}
}
