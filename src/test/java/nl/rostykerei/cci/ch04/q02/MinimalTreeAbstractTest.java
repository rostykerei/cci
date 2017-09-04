package nl.rostykerei.cci.ch04.q02;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.BinaryTreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public abstract class MinimalTreeAbstractTest extends AbstractFactoryTest<MinimalTree<Integer>> {

    /**
     *      4
     *    /  \
     *   2    6
     *  / \  / \
     * 1  3 5  7
     */
    @Test
    public void testBST() throws Exception {
        BinaryTreeNode<Integer> root = testInstance.buildBST(
                new Integer[] {1, 2, 3, 4, 5, 6, 7}
        );

        assertEquals(4, (int) root.getData());

        assertEquals(2, (int) root.getLeft().getData());
        assertEquals(1, (int) root.getLeft().getLeft().getData());
        assertEquals(3, (int) root.getLeft().getRight().getData());

        assertEquals(6, (int) root.getRight().getData());
        assertEquals(5, (int) root.getRight().getLeft().getData());
        assertEquals(7, (int) root.getRight().getRight().getData());
    }


    /**
     *      6
     *    /  \
     *   2    10
     *    \   / \
     *    4  8  20
     */
    @Test
    public void testBST2() throws Exception {
        BinaryTreeNode<Integer> root = testInstance.buildBST(
                new Integer[] {2, 4, 6, 8, 10, 20}
        );

        assertEquals(6, (int) root.getData());
    }

    @Test
    public void testBST3() throws Exception {
        BinaryTreeNode<Integer> root = testInstance.buildBST(
                new Integer[] {1}
        );

        assertEquals(1, (int) root.getData());
    }

    @Test
    public void testBST4() throws Exception {
        BinaryTreeNode<Integer> root = testInstance.buildBST(
                new Integer[] {1, 2, 3}
        );

        assertEquals(2, (int) root.getData());
        assertEquals(1, (int) root.getLeft().getData());
        assertEquals(3, (int) root.getRight().getData());
    }

    @Test
    public void testBST5() throws Exception {
        BinaryTreeNode<Integer> root = testInstance.buildBST(
                new Integer[] {1, 2}
        );

        assertEquals(1, (int) root.getData());
        assertNull(root.getLeft());
        assertEquals(2, (int) root.getRight().getData());
    }
}
