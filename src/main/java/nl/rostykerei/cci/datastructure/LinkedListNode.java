package nl.rostykerei.cci.datastructure;

import java.util.ArrayList;
import java.util.List;

/**
 * Doubly linked list implementation.
 *
 * @author Rosty Kerei
 */
public class LinkedListNode<T> {

    private LinkedListNode<T> previous;
    private LinkedListNode<T> next;

    private T data;

    public LinkedListNode(T data) {
        this.data = data;
    }

    public LinkedListNode<T> getNext() {
        return next;
    }

    public LinkedListNode<T> setNext(LinkedListNode<T> next) {
        if (next != null) {
            next.previous = this;
        }

        this.next = next;
        return this;
    }

    public LinkedListNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(LinkedListNode<T> previous) {
        if (previous != null) {
            previous.next = this;
        }

        this.previous = previous;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<T> toList() {
        List<T> result = new ArrayList<>();
        LinkedListNode<T> node = this;

        while (node != null) {
            result.add(node.getData());
            node = node.getNext();
        }

        return result;
    }
}
