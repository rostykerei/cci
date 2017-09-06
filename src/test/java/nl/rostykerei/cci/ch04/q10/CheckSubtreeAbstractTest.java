package nl.rostykerei.cci.ch04.q10;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.BinaryTreeNode;
import nl.rostykerei.cci.datastructure.impl.BinaryTreeNodeImpl;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class CheckSubtreeAbstractTest extends AbstractFactoryTest<CheckSubtree<Integer>> {

    @Test
    public void checkTrue() throws Exception {
        BinaryTreeNode<Integer> tree1 = new BinaryTreeNodeImpl<>(
                new BinaryTreeNodeImpl<>(
                        new BinaryTreeNodeImpl<>(1),
                        new BinaryTreeNodeImpl<>(2),
                        3),
                new BinaryTreeNodeImpl<>(
                        new BinaryTreeNodeImpl<>(
                                new BinaryTreeNodeImpl<>(
                                        new BinaryTreeNodeImpl<>(5),
                                        new BinaryTreeNodeImpl<>(6),
                                        7),
                                new BinaryTreeNodeImpl<>(8),
                                9),
                        new BinaryTreeNodeImpl<>(20),
                        10),
                4);

        BinaryTreeNode<Integer> tree2 = new BinaryTreeNodeImpl<>(
                new BinaryTreeNodeImpl<>(5),
                new BinaryTreeNodeImpl<>(6),
                7);

        assertTrue(testInstance.isSubtree(tree1, tree2));
    }

    @Test
    public void checkFalse1() throws Exception {
        BinaryTreeNode<Integer> tree1 = new BinaryTreeNodeImpl<>(
                new BinaryTreeNodeImpl<>(
                        new BinaryTreeNodeImpl<>(1),
                        new BinaryTreeNodeImpl<>(2),
                        3),
                new BinaryTreeNodeImpl<>(
                        new BinaryTreeNodeImpl<>(5),
                        new BinaryTreeNodeImpl<>(7),
                        6),
                4);

        BinaryTreeNode<Integer> tree2 = new BinaryTreeNodeImpl<>(
                new BinaryTreeNodeImpl<>(5),
                new BinaryTreeNodeImpl<>(11),
                6);

        assertFalse(testInstance.isSubtree(tree1, tree2));
    }

    @Test
    public void checkFalse2() throws Exception {
        BinaryTreeNode<Integer> tree1 = new BinaryTreeNodeImpl<>(
                new BinaryTreeNodeImpl<>(
                        new BinaryTreeNodeImpl<>(1),
                        new BinaryTreeNodeImpl<>(2),
                        3),
                new BinaryTreeNodeImpl<>(
                        new BinaryTreeNodeImpl<>(5),
                        new BinaryTreeNodeImpl<>(7),
                        6),
                4);

        BinaryTreeNode<Integer> tree2 = new BinaryTreeNodeImpl<>(
                new BinaryTreeNodeImpl<>(5),
                null,
                6);

        assertFalse(testInstance.isSubtree(tree1, tree2));
    }

    @Test
    public void checkFalse3() throws Exception {
        BinaryTreeNode<Integer> tree1 = new BinaryTreeNodeImpl<>(
                new BinaryTreeNodeImpl<>(
                        new BinaryTreeNodeImpl<>(1),
                        new BinaryTreeNodeImpl<>(2),
                        3),
                new BinaryTreeNodeImpl<>(
                        null,
                        new BinaryTreeNodeImpl<>(7),
                        6),
                4);

        BinaryTreeNode<Integer> tree2 = new BinaryTreeNodeImpl<>(
                new BinaryTreeNodeImpl<>(5),
                null,
                6);

        assertFalse(testInstance.isSubtree(tree1, tree2));
    }

    @Test
    public void checkFalse4() throws Exception {
        BinaryTreeNode<Integer> tree1 = new BinaryTreeNodeImpl<>(
                new BinaryTreeNodeImpl<>(
                        new BinaryTreeNodeImpl<>(1),
                        new BinaryTreeNodeImpl<>(2),
                        3),
                new BinaryTreeNodeImpl<>(
                        new BinaryTreeNodeImpl<>(
                                new BinaryTreeNodeImpl<>(
                                        new BinaryTreeNodeImpl<>(75),
                                        new BinaryTreeNodeImpl<>(6),
                                        7),
                                new BinaryTreeNodeImpl<>(8),
                                9),
                        new BinaryTreeNodeImpl<>(20),
                        10),
                4);

        BinaryTreeNode<Integer> tree2 = new BinaryTreeNodeImpl<>(
                new BinaryTreeNodeImpl<>(5),
                new BinaryTreeNodeImpl<>(6),
                7);

        assertFalse(testInstance.isSubtree(tree1, tree2));
    }
}
