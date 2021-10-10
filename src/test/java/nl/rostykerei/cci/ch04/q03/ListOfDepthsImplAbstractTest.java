package nl.rostykerei.cci.ch04.q03;

import nl.rostykerei.cci.ch04.q02.MinimalTreeImpl;
import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.BinaryTreeNode;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public abstract class ListOfDepthsImplAbstractTest extends AbstractFactoryTest<ListOfDepths<Integer>> {

    @Test
    public void test1() {
        BinaryTreeNode<Integer> root = new MinimalTreeImpl<Integer>().buildBST(
                new Integer[]{1, 2, 3, 4, 5, 6, 7}
        );

        List<LinkedList<BinaryTreeNode<Integer>>> result = testInstance.getListOfDepth(root);

        assertEquals(3, result.size());

        assertArrayEquals(new Integer[]{4}, result.get(0).stream().map(BinaryTreeNode::getData).toArray());
        assertArrayEquals(new Integer[]{2, 6}, result.get(1).stream().map(BinaryTreeNode::getData).toArray());
        assertArrayEquals(new Integer[]{1, 3, 5, 7}, result.get(2).stream().map(BinaryTreeNode::getData).toArray());
    }
}
