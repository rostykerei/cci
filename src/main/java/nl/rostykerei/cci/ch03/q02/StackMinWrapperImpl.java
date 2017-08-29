package nl.rostykerei.cci.ch03.q02;

import nl.rostykerei.cci.datastructure.Stack;
import nl.rostykerei.cci.datastructure.impl.StackImpl;

/**
 * Another implementation of {@link StackMin} using a node wrapper.
 *
 * @author Rosty Kerei
 */
public final class StackMinWrapperImpl implements StackMin {

    /**
     * Wraps integer node, adds min value.
     */
    private static class NodeWrapper {

        /**
         * Actual data.
         */
        private int data;

        /**
         * Most recent minimum.
         */
        private int min;
    }

    /**
     * Stack of wrappers.
     */
    private Stack<NodeWrapper> stack = new StackImpl<>();

    @Override
    public int min() {
        return stack.peek().min;
    }

    @Override
    public Integer pop() {
        return stack.pop().data;
    }

    @Override
    public void push(final Integer item) {
        NodeWrapper node = new NodeWrapper();
        node.data = item;

        if (isEmpty()) {
            node.min = item;
        } else {
            node.min = Math.min(stack.peek().min, item);
        }

        stack.push(node);
    }

    @Override
    public Integer peek() {
        return stack.peek().data;
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
