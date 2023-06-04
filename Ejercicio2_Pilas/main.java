public class main {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");

        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(15);

        Stack<String> stack2 = new Stack<>();
        stack2.push("Mauricio");
        stack2.push("Hola");

        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.peek()); 
        System.out.println(stack2.pop()); 
        System.out.println(stack2.peek());

    }
}
