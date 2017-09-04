package nl.rostykerei.cci.ch04.q05;

import nl.rostykerei.cci.ch04.q02.MinimalTreeImpl;
import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.BinaryTreeNode;
import nl.rostykerei.cci.datastructure.impl.BinaryTreeNodeImpl;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class ValidateBSTAbstractTest extends AbstractFactoryTest<ValidateBST<Integer>> {

    @Test
    public void testValid() throws Exception {
        BinaryTreeNode<Integer> root = new MinimalTreeImpl<Integer>().buildBST(
                new Integer[] {1, 2, 3, 4, 5, 6, 7}
        );

        assertTrue(testInstance.isValidBST(root));
    }

    @Test
    public void testValid2() throws Exception {
        BinaryTreeNode<Integer> valid = new BinaryTreeNodeImpl<>(
                new BinaryTreeNodeImpl<>(1),
                new BinaryTreeNodeImpl<>(3),
                2);

        assertTrue(testInstance.isValidBST(valid));
    }

    @Test
    public void testInvalid() throws Exception {
        BinaryTreeNode<Integer> invalid = new BinaryTreeNodeImpl<>(
                new BinaryTreeNodeImpl<>(2),
                new BinaryTreeNodeImpl<>(3),
                1);

        assertFalse(testInstance.isValidBST(invalid));
    }

    @Test
    public void testInvalid2() throws Exception {
        BinaryTreeNode<Integer> invalid = new BinaryTreeNodeImpl<>(
                new BinaryTreeNodeImpl<>(
                        null,
                        new BinaryTreeNodeImpl<>(25),
                        10),
                new BinaryTreeNodeImpl<>(30),
                20);

        assertFalse(testInstance.isValidBST(invalid));
    }

    @Test
    public void testInvalid3() throws Exception {
        BinaryTreeNode<Integer> invalid = new BinaryTreeNodeImpl<>(
                new BinaryTreeNodeImpl<>(10),
                new BinaryTreeNodeImpl<>(
                        new BinaryTreeNodeImpl<>(15),
                        new BinaryTreeNodeImpl<>(40),
                        30),
                20);

        assertFalse(testInstance.isValidBST(invalid));
    }
}
