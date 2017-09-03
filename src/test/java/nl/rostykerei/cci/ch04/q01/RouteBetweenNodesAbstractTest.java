package nl.rostykerei.cci.ch04.q01;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.TreeNode;
import nl.rostykerei.cci.datastructure.impl.TreeNodeImpl;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class RouteBetweenNodesAbstractTest extends AbstractFactoryTest<RouteBetweenNodes<String>> {

    /**
     * Happy-flow test.
     *    A
     *  /  \
     * B    D
     * |  / |
     * C    E
     */
    @Test
    public void testPath() throws Exception {
        TreeNode<String> treeNodeA = new TreeNodeImpl<>("A");
        TreeNode<String> treeNodeB = new TreeNodeImpl<>("B");
        TreeNode<String> treeNodeC = new TreeNodeImpl<>("C");
        TreeNode<String> treeNodeD = new TreeNodeImpl<>("D");
        TreeNode<String> treeNodeE = new TreeNodeImpl<>("E");

        treeNodeA.addChild(treeNodeB);
        treeNodeA.addChild(treeNodeD);

        treeNodeB.addChild(treeNodeC);
        treeNodeB.addChild(treeNodeC);

        treeNodeD.addChild(treeNodeC);
        treeNodeD.addChild(treeNodeE);

        assertTrue(testInstance.isRoutePossible(treeNodeA, treeNodeE));
    }

    /**
     *      A
     *     / \
     *    B   G
     *    | \
     *    C  D
     *      / \
     *     E   F
     */
    @Test
    public void testPath2() throws Exception {
        TreeNode<String> treeNodeA = new TreeNodeImpl<>("A");
        TreeNode<String> treeNodeB = new TreeNodeImpl<>("B");
        TreeNode<String> treeNodeC = new TreeNodeImpl<>("C");
        TreeNode<String> treeNodeD = new TreeNodeImpl<>("D");
        TreeNode<String> treeNodeE = new TreeNodeImpl<>("E");
        TreeNode<String> treeNodeF = new TreeNodeImpl<>("F");
        TreeNode<String> treeNodeG = new TreeNodeImpl<>("G");

        treeNodeA.addChild(treeNodeB);
        treeNodeA.addChild(treeNodeG);

        treeNodeB.addChild(treeNodeC);
        treeNodeB.addChild(treeNodeD);

        treeNodeD.addChild(treeNodeE);
        treeNodeD.addChild(treeNodeF);

        assertTrue(testInstance.isRoutePossible(treeNodeA, treeNodeG));

    }

    /**
     *      A
     * / /  |  \  \
     * B C  D  E  F
     * |
     * G
     */
    @Test
    public void testPath3() throws Exception {
        TreeNode<String> treeNodeA = new TreeNodeImpl<>("A");
        TreeNode<String> treeNodeB = new TreeNodeImpl<>("B");
        TreeNode<String> treeNodeC = new TreeNodeImpl<>("C");
        TreeNode<String> treeNodeD = new TreeNodeImpl<>("D");
        TreeNode<String> treeNodeE = new TreeNodeImpl<>("E");
        TreeNode<String> treeNodeF = new TreeNodeImpl<>("F");
        TreeNode<String> treeNodeG = new TreeNodeImpl<>("G");

        treeNodeA.addChild(treeNodeB);
        treeNodeA.addChild(treeNodeC);
        treeNodeA.addChild(treeNodeD);
        treeNodeA.addChild(treeNodeE);
        treeNodeA.addChild(treeNodeF);

        treeNodeB.addChild(treeNodeG);

        assertTrue(testInstance.isRoutePossible(treeNodeA, treeNodeG));
    }

    @Test
    public void testFalse() throws Exception {
        TreeNode<String> treeNodeA = new TreeNodeImpl<>("A");
        TreeNode<String> treeNodeB = new TreeNodeImpl<>("B");
        TreeNode<String> treeNodeC = new TreeNodeImpl<>("C");
        TreeNode<String> treeNodeD = new TreeNodeImpl<>("D");
        TreeNode<String> treeNodeE = new TreeNodeImpl<>("E");

        treeNodeA.addChild(treeNodeB);
        treeNodeB.addChild(treeNodeC);
        treeNodeB.addChild(treeNodeD);
        treeNodeD.addChild(treeNodeC);
        treeNodeE.addChild(treeNodeC);

        assertFalse(testInstance.isRoutePossible(treeNodeA, treeNodeE));
    }
}
