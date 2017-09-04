package nl.rostykerei.cci.ch03.q02;

import nl.rostykerei.cci.datastructure.impl.StackImpl;

import java.util.EmptyStackException;

/**
 * Implementation of {@link StackMin}.
 *
 * @author Rosty Kerei
 */
public final class StackMinImpl extends StackImpl<Integer> implements StackMin {

    /**
     * Node with a min value.
     */
    private class StackMinNode extends StackNode<Integer> {

        /**
         * Min value holder.
         */
        private final int min;

        /**
         * Constructor.
         *
         * @param value data value
         * @param minValue min value
         */
        StackMinNode(final int value, final int minValue) {
            super(value);
            this.min = minValue;
        }

        /**
         * Gets min value.
         *
         * @return min value
         */
        int getMin() {
            return min;
        }
    }

    @Override
    public int min() {
        StackMinNode top = (StackMinNode) getTop();

        if (top == null) {
            throw new EmptyStackException();
        }

        return top.getMin();
    }

    @Override
    public void push(final Integer item) {
        if (item == null) {
            throw new NullPointerException();
        }

        int min;

        StackMinNode top = (StackMinNode) getTop();

        if (top == null) {
            min = item;
        } else {
            min = Math.min(item, top.getMin());
        }

        StackMinNode t = new StackMinNode(item, min);
        t.setNext(top);

        setTop(t);
    }
}
