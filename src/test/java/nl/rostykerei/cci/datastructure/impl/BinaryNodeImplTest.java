package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.BinaryNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryNodeImplTest {
    @Test
    public void test1() throws Exception {
        BinaryNode<Integer> root = new BinaryNodeImpl<>(2);
        BinaryNode<Integer> left = new BinaryNodeImpl<>(1);
        BinaryNode<Integer> right = new BinaryNodeImpl<>(3);

        root.setLeft(left);
        root.setRight(right);

        assertEquals(2, (int) root.getData());
        assertEquals(1, (int) root.getLeft().getData());
        assertEquals(3, (int) root.getRight().getData());

        BinaryNode<Integer> root2 = new BinaryNodeImpl<>(left, right, 2);

        assertEquals(2, (int) root2.getData());
        assertEquals(1, (int) root2.getLeft().getData());
        assertEquals(3, (int) root2.getRight().getData());
    }

}