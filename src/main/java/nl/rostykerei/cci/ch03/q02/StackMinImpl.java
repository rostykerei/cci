package nl.rostykerei.cci.ch03.q02;

import java.util.EmptyStackException;

/**
 * Implementation of {@link StackMin}.
 *
 * @author Rosty Kerei
 */
public final class StackMinImpl implements StackMin<Integer> {

    /**
     * Stack node with data and most recent minimum.
     */
    private static class StackMinNode {

        /**
         * Data holder.
         */
        private int data;

        /**
         * Minimum.
         */
        private int min;

        /**
         * Link to the next node.
         */
        private StackMinNode next;

        /**
         * Stack node constructor.
         *
         * @param value    data
         * @param minValue most recent minimum
         */
        StackMinNode(final int value, final int minValue) {
            this.data = value;
            this.min = minValue;
        }
    }

    @Override
    public Integer min() {
        if (top == null) {
            throw new EmptyStackException();
        }

        return top.min;
    }

    /**
     * Top of the stack.
     */
    private StackMinNode top;

    @Override
    public Integer pop() {
        if (top == null) {
            throw new EmptyStackException();
        }

        int item = top.data;

        top = top.next;

        return item;
    }

    @Override
    public void push(final Integer item) {
        if (item == null) {
            throw new NullPointerException();
        }

        int min;

        if (this.top == null) {
            min = item;
        } else {
            min = Math.min(item, this.top.min);
        }

        StackMinNode t = new StackMinNode(item, min);
        t.next = top;
        top = t;
    }

    @Override
    public Integer peek() {
        if (top == null) {
            throw new EmptyStackException();
        }

        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
