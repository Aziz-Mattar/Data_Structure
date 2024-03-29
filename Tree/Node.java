package Tree;

import java.util.ArrayList;
import java.util.List;

public class Node<E> {
    private List<Node<E>> children = new ArrayList<Node<E>>();
    private Node<E> parent = null;
    private E data = null;

    public Node(E data) {
        this.data = data;
    }

    public List<Node<E>> getChildren() {
        return children;
    }

    public Node<E> getParent() {
        return parent;
    }

    public void setParent(Node<E> parent) {
        this.parent = parent;
    }

    public void setChild(Node<E> child) {
        this.children.add(child);
    }

    public void addParent(Node<E> parent) {
        this.setParent(parent);
        parent.setChild(this);
    }

    public void addChild(Node<E> child) {
        child.setParent(this);
        this.setChild(child);
    }
}
