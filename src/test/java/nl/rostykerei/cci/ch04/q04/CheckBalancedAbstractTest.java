package nl.rostykerei.cci.ch04.q04;

import nl.rostykerei.cci.ch04.q02.MinimalTreeImpl;
import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.BinaryTreeNode;
import nl.rostykerei.cci.datastructure.impl.BinaryTreeNodeImpl;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class CheckBalancedAbstractTest extends AbstractFactoryTest<CheckBalanced<Integer>> {

    @Test
    public void testBalanced() {
        BinaryTreeNode<Integer> tree = new MinimalTreeImpl<Integer>().buildBST(
                new Integer[]{1, 2, 3, 4, 5, 6, 7}
        );

        assertTrue(testInstance.checkBalanced(tree));
    }

    @Test
    public void testUnbalanced() {
        BinaryTreeNode<Integer> tree = new BinaryTreeNodeImpl<>(
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

        assertFalse(testInstance.checkBalanced(tree));
    }

    @Test
    public void testUnbalanced2() {
        BinaryTreeNode<Integer> tree = new BinaryTreeNodeImpl<>(
                new BinaryTreeNodeImpl<>(
                        new BinaryTreeNodeImpl<>(
                                null,
                                new BinaryTreeNodeImpl<>(1),
                                2),
                        new BinaryTreeNodeImpl<>(4),
                        3),
                new BinaryTreeNodeImpl<>(6),
                5);

        assertFalse(testInstance.checkBalanced(tree));
    }
}
