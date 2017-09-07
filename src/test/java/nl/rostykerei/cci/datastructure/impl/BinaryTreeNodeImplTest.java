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

        assertEquals(root, root.getLeft().getParent());
        assertEquals(root, root.getRight().getParent());

        BinaryTreeNode<Integer> root2 = new BinaryTreeNodeImpl<>(left, right, 2);

        assertEquals(2, (int) root2.getData());
        assertEquals(1, (int) root2.getLeft().getData());
        assertEquals(3, (int) root2.getRight().getData());
    }

    @Test
    public void getChildrenTest() throws Exception {
        BinaryTreeNode<Integer> root = new BinaryTreeNodeImpl<>(2);

        assertEquals(0, root.getChildren().size());

        root.setLeft(new BinaryTreeNodeImpl<>(1));

        assertEquals(1, root.getChildren().size());

        root.setRight(new BinaryTreeNodeImpl<>(3));

        assertEquals(2, root.getChildren().size());

        root.setRight(null);

        assertEquals(1, root.getChildren().size());

        root.setLeft(null);

        assertEquals(0, root.getChildren().size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void addChildTest() throws Exception {
        new BinaryTreeNodeImpl<>(2).addChild(new BinaryTreeNodeImpl<>(1));
    }
}