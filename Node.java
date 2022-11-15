public class Node<T>
{
    private T data;
    private Node<T> next;
    
    public Node(){
        data = null;
        next = null;
    }
    public void setData( T p){
        data = p;
    }
    public T getData(){
        return data;
    }
    public void setNext(Node<T> n){
        next = n;
    }
    public Node<T> getNext(){
        return next;
    }
}

