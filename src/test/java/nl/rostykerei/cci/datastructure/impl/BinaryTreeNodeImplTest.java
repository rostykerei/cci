package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeNodeImplTest {
    @Test
    public void test1() throws Exception {
        BinaryTreeNode<Integer> root = new BinaryTreeNodeImpl<>(2);
        BinaryTreeNode<Integer> left = new BinaryTreeNodeImpl<>(1);
        BinaryTreeNode<Integer> right = new BinaryTreeNodeImpl<>(3);

        root.setLeft(left);
        root.setRight(right);

        assertEquals(2, (int) root.getData());
        assertEquals(1, (int) root.getLeft().getData());
        assertEquals(3, (int) root.getRight().getData());

        BinaryTreeNode<Integer> root2 = new BinaryTreeNodeImpl<>(left, right, 2);

        assertEquals(2, (int) root2.getData());
        assertEquals(1, (int) root2.getLeft().getData());
        assertEquals(3, (int) root2.getRight().getData());
    }

}