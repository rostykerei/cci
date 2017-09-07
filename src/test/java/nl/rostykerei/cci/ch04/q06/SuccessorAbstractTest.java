package nl.rostykerei.cci.ch04.q06;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.BinaryTreeNode;
import nl.rostykerei.cci.datastructure.impl.BinaryTreeNodeImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public abstract class SuccessorAbstractTest extends AbstractFactoryTest<Successor<Integer>>{

    @Test
    public void test1() throws Exception {

        BinaryTreeNode<Integer> n1 = new BinaryTreeNodeImpl<>(1);
        BinaryTreeNode<Integer> n2 = new BinaryTreeNodeImpl<>(2);
        BinaryTreeNode<Integer> n3 = new BinaryTreeNodeImpl<>(3);
        BinaryTreeNode<Integer> n4 = new BinaryTreeNodeImpl<>(4);
        BinaryTreeNode<Integer> n5 = new BinaryTreeNodeImpl<>(5);
        BinaryTreeNode<Integer> n6 = new BinaryTreeNodeImpl<>(6);
        BinaryTreeNode<Integer> n7 = new BinaryTreeNodeImpl<>(7);
        BinaryTreeNode<Integer> n8 = new BinaryTreeNodeImpl<>(8);
        BinaryTreeNode<Integer> n9 = new BinaryTreeNodeImpl<>(9);
        BinaryTreeNode<Integer> n10 = new BinaryTreeNodeImpl<>(10);

        n5.setLeft(n2);
        n5.setRight(n8);

        n2.setLeft(n1);
        n2.setRight(n3);

        n3.setRight(n4);

        n8.setLeft(n6);
        n8.setRight(n9);

        n6.setRight(n7);

        n9.setRight(n10);

        assertEquals(n2, testInstance.findNext(n1));
        assertEquals(n3, testInstance.findNext(n2));
        assertEquals(n4, testInstance.findNext(n3));
        assertEquals(n5, testInstance.findNext(n4));
        assertEquals(n6, testInstance.findNext(n5));
        assertEquals(n7, testInstance.findNext(n6));
        assertEquals(n8, testInstance.findNext(n7));
        assertEquals(n9, testInstance.findNext(n8));
        assertEquals(n10, testInstance.findNext(n9));
        assertNull(testInstance.findNext(n10));

    }
}
