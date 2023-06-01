package EDA_LAB3.Ejercicio3_Colas;

public class Node<T> {
    private T data;
    private Node<T> nextNode;

    public Node (T data){
        this.data = data;
        this.nextNode = null;
        }
    
    public T getData(){
        return data;
    }
    public Node<T> getNextNode(){
        return nextNode;
    }
    public void setNextNode(Node<T> nextNode){
        this.nextNode = nextNode;
    }
}

