package doubleLinkedList;

public class Node <E>{
    E data;
    Node<E> next;
    Node<E> previous;

    public Node(E data) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }
}
