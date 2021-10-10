package nl.rostykerei.cci.ch04.q12;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.BinaryTreeNode;
import nl.rostykerei.cci.datastructure.impl.BinaryTreeNodeImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class PathsWithSumAbstractTest extends AbstractFactoryTest<PathsWithSum> {

    @Test
    public void testSum() {
        BinaryTreeNode<Integer> tree = new BinaryTreeNodeImpl<>(
                new BinaryTreeNodeImpl<>(
                        new BinaryTreeNodeImpl<>(
                                new BinaryTreeNodeImpl<>(3),
                                new BinaryTreeNodeImpl<>(-2),
                                3
                        ),
                        new BinaryTreeNodeImpl<>(
                                null,
                                new BinaryTreeNodeImpl<>(1),
                                2),
                        5
                ),
                new BinaryTreeNodeImpl<>(
                        null,
                        new BinaryTreeNodeImpl<>(11),
                        -3
                ),
                10
        );

        assertEquals(3, testInstance.pathsWithSum(tree, 8));
    }
}
